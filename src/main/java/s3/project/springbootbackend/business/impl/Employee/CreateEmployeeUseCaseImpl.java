package s3.project.springbootbackend.business.impl.Employee;

import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import s3.project.springbootbackend.business.exeptions.InvalidDataInRequest;
import s3.project.springbootbackend.business.useCases.Employee.CreateEmployeeUseCase;
import s3.project.springbootbackend.business.validations.ValidateEmployee;
import s3.project.springbootbackend.domain.Requests.Employee.CreateEmployeeRequest;
import s3.project.springbootbackend.domain.Responses.Employee.CreateEmployeeResponse;
import s3.project.springbootbackend.persistence.Entities.*;
import s3.project.springbootbackend.persistence.repositories.EmployeeRepository;
import s3.project.springbootbackend.persistence.repositories.UserRepository;

import java.util.Set;

@Service
@AllArgsConstructor
public class CreateEmployeeUseCaseImpl implements CreateEmployeeUseCase {

    private EmployeeRepository employeeRepository;
    private UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    @Override
    public CreateEmployeeResponse createEmployee(CreateEmployeeRequest createEmployeeRequest) {
        EmployeeEntity savedEmployee = saveNewEmployee(createEmployeeRequest);

        saveNewUser(savedEmployee, createEmployeeRequest.getPassword(), createEmployeeRequest.getUsername());

        return CreateEmployeeResponse.builder()
                .id(savedEmployee.getId())
                .build();
    }
    private EmployeeEntity saveNewEmployee(CreateEmployeeRequest request){

            EmployeeEntity employeeEntity = EmployeeEntity.builder()
                    .firstName(request.getFirstName())
                    .lastName(request.getLastName())
                    .build();
            return employeeRepository.save(employeeEntity);

    }

    private void saveNewUser(EmployeeEntity employee, String password, String username){
        //encode password
        ValidateEmployee.validate(password);
        if(! userRepository.existsDistinctByUsername(username)) {
        String encodedPassword = passwordEncoder.encode(password);
        UserEntity newUser =UserEntity.builder()
                .username(username)
                .password(encodedPassword)     //encoded password here
                .employee(employee)
                .build();

        newUser.setUserRoles(Set.of(
                UserRoleEntity.builder()
                        .user(newUser)
                        .role(RoleEnum.EMPLOYEE)
                        .build()));
        userRepository.save(newUser);
        }else {
            throw new InvalidDataInRequest("EMAIL_ALREADY_EXISTS");
        }
    }
}

package s3.project.springbootbackend.business.impl.Employee;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import s3.project.springbootbackend.business.useCases.Employee.CreateEmployeeUseCase;
import s3.project.springbootbackend.domain.Requests.CreateEmployeeRequest;
import s3.project.springbootbackend.domain.Responses.CreateEmployeeResponse;
import s3.project.springbootbackend.persistence.Entities_DTO.EmployeeEntity;
import s3.project.springbootbackend.persistence.repositories.EmployeeRepository;
@Service
@AllArgsConstructor
public class CreateEmployeeUseCaseImpl implements CreateEmployeeUseCase {

    EmployeeRepository employeeRepository;
    @Override
    public CreateEmployeeResponse createEmployee(CreateEmployeeRequest createEmployeeRequest) {
        EmployeeEntity savedEmployee = add(createEmployeeRequest);
        return CreateEmployeeResponse.builder()
                .id(savedEmployee.getId())
                .build();
    }

    private EmployeeEntity add(CreateEmployeeRequest request){
        EmployeeEntity employeeEntity = EmployeeEntity.builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .username(request.getUsername())
                .password(request.getPassword())
                .build();
        return employeeRepository.save(employeeEntity);
    }
}

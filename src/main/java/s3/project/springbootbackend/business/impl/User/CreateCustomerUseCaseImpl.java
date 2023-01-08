package s3.project.springbootbackend.business.impl.User;

import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import s3.project.springbootbackend.business.exeptions.InvalidDataInRequest;
import s3.project.springbootbackend.business.useCases.User.CreateCustomerUseCase;
import s3.project.springbootbackend.business.validations.ValidateCustomer;
import s3.project.springbootbackend.domain.Requests.Customer.CreateCustomerRequest;
import s3.project.springbootbackend.domain.Responses.Customer.CreateCustomerResponse;
import s3.project.springbootbackend.persistence.Entities.CustomerEntity;
import s3.project.springbootbackend.persistence.Entities.RoleEnum;
import s3.project.springbootbackend.persistence.Entities.UserEntity;
import s3.project.springbootbackend.persistence.Entities.UserRoleEntity;
import s3.project.springbootbackend.persistence.repositories.CustomerRepository;
import s3.project.springbootbackend.persistence.repositories.UserRepository;

import java.util.Set;

@Service
@AllArgsConstructor
public class CreateCustomerUseCaseImpl implements CreateCustomerUseCase {

    private CustomerRepository customerRepository;
    private UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public CreateCustomerResponse createUser(CreateCustomerRequest request) {
        CustomerEntity savedUser = saveNewCustomer(request);

        saveNewUser(savedUser, request.getPassword(), request.getUsername());

        return CreateCustomerResponse.builder()
                .userId(savedUser.getId())
                .build();
    }

    private CustomerEntity saveNewCustomer(CreateCustomerRequest request){
        ValidateCustomer.validate(request.getPassword());
        if(! userRepository.existsDistinctByUsername(request.getUsername())) {
            CustomerEntity customerEntity = CustomerEntity.builder()
                    .firstName(request.getFirstName())
                    .lastName(request.getLastName())
                    .build();
            return customerRepository.save(customerEntity);
        }else {
            throw new InvalidDataInRequest("EMAIL_ALREADY_EXISTS");
        }
    }

    private void saveNewUser(CustomerEntity customer, String password, String username){

        //encode password
        String encodedPassword = passwordEncoder.encode(password);
        UserEntity newUser =UserEntity.builder()
                .username(username)
                .password(encodedPassword)     //encoded password here
                .customer(customer)
                .build();

        newUser.setUserRoles(Set.of(
                UserRoleEntity.builder()
                        .user(newUser)
                        .role(RoleEnum.CUSTOMER)
                        .build()));
                userRepository.save(newUser);

    }
}

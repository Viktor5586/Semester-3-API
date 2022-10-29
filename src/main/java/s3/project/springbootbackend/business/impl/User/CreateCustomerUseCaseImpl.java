package s3.project.springbootbackend.business.impl.User;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import s3.project.springbootbackend.business.useCases.User.CreateCustomerUseCase;
import s3.project.springbootbackend.domain.Requests.CreateUserRequest;
import s3.project.springbootbackend.domain.Responses.CreateUserResponse;
import s3.project.springbootbackend.persistence.Entities_DTO.CustomerEntity;
import s3.project.springbootbackend.persistence.repositories.CustomerRepository;

@Service
@AllArgsConstructor
public class CreateCustomerUseCaseImpl implements CreateCustomerUseCase {

    private CustomerRepository customerRepository;

    @Override
    public CreateUserResponse createUser(CreateUserRequest request) {
        CustomerEntity savedUser = add(request);
        return CreateUserResponse.builder()
                .userId(savedUser.getId())
                .build();
    }

    public CustomerEntity add(CreateUserRequest request){

        CustomerEntity newUser = CustomerEntity.builder()
                .username(request.getUsername())
                .password(request.getPassword())
                .build();
        return customerRepository.save(newUser);
    }
}

package s3.project.springbootbackend.business.impl.Customer;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.security.crypto.password.PasswordEncoder;
import s3.project.springbootbackend.business.impl.User.CreateCustomerUseCaseImpl;
import s3.project.springbootbackend.domain.Requests.CreateCustomerRequest;
import s3.project.springbootbackend.domain.Responses.CreateCustomerResponse;
import s3.project.springbootbackend.domain.Responses.CreateUserResponse;
import s3.project.springbootbackend.persistence.Entities.CustomerEntity;
import s3.project.springbootbackend.persistence.repositories.CustomerRepository;
import s3.project.springbootbackend.persistence.repositories.UserRepository;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CreateCustomerUseCaseImplTest {
//    @Mock
//    private CustomerRepository customerRepository;
    @Mock
    private UserRepository userRepository;
    @Mock
    private PasswordEncoder passwordEncoder;
    @Mock
    private CustomerRepository repository;
    @InjectMocks
    private CreateCustomerUseCaseImpl createCustomerUseCase;

    @Test
    void createCustomerUseCae_successful(){
        CreateCustomerRequest request = CreateCustomerRequest.builder().firstName("Test").lastName("Testing")
                .username("test@test.com").password("aaaa").build();
        CustomerEntity customer = CustomerEntity.builder().id(1L).firstName("Test").lastName("Testing").build();
        when(repository.save(any())).thenReturn(customer);
        when(passwordEncoder.encode(any())).thenReturn("encodedPassword");
        when(userRepository.save(any())).thenReturn(null);
        //when(customerRepository.save(any())).thenReturn(null);
        CreateUserResponse actualResponse = createCustomerUseCase.createUser(request);
        CreateUserResponse expectedResponse = CreateUserResponse.builder().userId(1L).build();

        assertEquals(expectedResponse, actualResponse);
//        verify(repository.save(any()));




    }
}

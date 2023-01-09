package s3.project.springbootbackend.business.impl.Customer;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.security.crypto.password.PasswordEncoder;
import s3.project.springbootbackend.business.impl.User.CreateCustomerUseCaseImpl;
import s3.project.springbootbackend.domain.Requests.Customer.CreateCustomerRequest;
import s3.project.springbootbackend.domain.Responses.Customer.CreateCustomerResponse;
import s3.project.springbootbackend.persistence.Entities.CustomerEntity;
import s3.project.springbootbackend.persistence.repositories.CustomerRepository;
import s3.project.springbootbackend.persistence.repositories.UserRepository;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class CreateCustomerUseCaseImplTest {
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
        when(repository.save(CustomerEntity.builder().firstName("Test").lastName("Testing").build())).thenReturn(customer);
//        when(passwordEncoder.encode(request.getPassword())).thenReturn("encodedPassword");
        when(userRepository.save(any())).thenReturn(null);
        //when(customerRepository.save(any())).thenReturn(null);
        CreateCustomerResponse actualResponse = createCustomerUseCase.createUser(request);
        CreateCustomerResponse expectedResponse = CreateCustomerResponse.builder().userId(1L).build();

        assertEquals(expectedResponse, actualResponse);
        verify(repository, times(1)).save(any());




    }
}

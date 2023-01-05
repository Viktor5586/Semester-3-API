package s3.project.springbootbackend.business.impl.Customer;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import s3.project.springbootbackend.business.impl.User.UpdateCustomerUseCaseImpl;
import s3.project.springbootbackend.business.useCases.User.CreateCustomerUseCase;
import s3.project.springbootbackend.domain.Requests.Customer.CreateCustomerRequest;
import s3.project.springbootbackend.domain.Requests.Customer.UpdateCustomerRequest;
import s3.project.springbootbackend.domain.Responses.Customer.CreateCustomerResponse;
import s3.project.springbootbackend.persistence.Entities.CustomerEntity;
import s3.project.springbootbackend.persistence.Entities.UserEntity;
import s3.project.springbootbackend.persistence.repositories.CustomerRepository;
import s3.project.springbootbackend.persistence.repositories.UserRepository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class UpdateCustomerUseCaseImplTest {
    @Mock
    private CustomerRepository customerRepository;
    @Mock
    private CreateCustomerUseCase createCustomerUseCase;
    @Mock
    private UserRepository userRepository;
    @Mock
    private PasswordEncoder passwordEncoder;
    @InjectMocks
    private UpdateCustomerUseCaseImpl updateCustomerUseCase;

    @Test
    void UpdateCustomer_success(){
//        CreateCustomerRequest request = CreateCustomerRequest.builder().firstName("Test").lastName("Testing")
//                .username("test@test.com").password("aaaa").build();
//        CustomerEntity expected = CustomerEntity.builder().id(1L).firstName("Test").lastName("Testing").build();
//        UpdateCustomerRequest request1 = UpdateCustomerRequest.builder().id(1L).firstName("Test").lastName("Testing")
//                .username("test@test.com").oldPassword("aaaa").newPassword("bbbb").build();
//        updateCustomerUseCase.updateCustomer(request1);
//
//        when(customerRepository.save(CustomerEntity.builder().firstName("Test").lastName("Testing").build())).thenReturn(expected);
//        when(passwordEncoder.encode(request.getPassword())).thenReturn("encodedPassword");
//        when(userRepository.save(UserEntity.builder().username("test@test.com").password("aaaa").build())).thenReturn(null);
////        when(userRepository.updateUser(request1.getUsername(), request1.getNewPassword(), request1.getId())).thenReturn(null);
////        doThrow(new RuntimeException()).when(userRepository.updateUser(request1.getUsername(), request1.getNewPassword(), request1.getId())).;
//        //when(customerRepository.save(any())).thenReturn(null);
//        ResponseEntity actualResponse = updateCustomerUseCase.updateCustomer(request1);
//        ResponseEntity expectedResponse = ResponseEntity.ok().build();
//
//        assertEquals(expectedResponse, actualResponse);
//        verify(customerRepository, times(1)).save(any());
//        CustomerEntity customer = CustomerEntity.builder().id(1L).firstName("Test").lastName("Testing").build();
//        CustomerEntity updatedCustomer = CustomerEntity.builder().id(1L).firstName("Bob").lastName("Spenser").build();
//        UpdateCustomerRequest request = UpdateCustomerRequest.builder().id(1L).firstName("Bob").lastName("Spenser")
//                .username("bob@gmail.com").oldPassword("1234").newPassword("12345").build();
//        when(customerRepository.save(CustomerEntity.builder().id(1L).firstName("Test").lastName("Testing").build())).thenReturn(customer);
////        when(customerRepository.update("Bob","Spenser", 1L));
////        when(customerRepository.update(updatedCustomer.getFirstName(), updatedCustomer.getLastName(), updatedCustomer.getId())));
//        when(passwordEncoder.encode(request.getOldPassword())).thenReturn("encodedPassword");
//        when(userRepository.save(any())).thenReturn(null);
//
//        ResponseEntity actualCustomer = updateCustomerUseCase.updateCustomer(request);
//        assertEquals(updatedCustomer,actualCustomer);

    }




}

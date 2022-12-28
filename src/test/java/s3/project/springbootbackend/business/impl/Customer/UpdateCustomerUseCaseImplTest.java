package s3.project.springbootbackend.business.impl.Customer;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.security.crypto.password.PasswordEncoder;
import s3.project.springbootbackend.business.impl.User.UpdateCustomerUseCaseImpl;
import s3.project.springbootbackend.persistence.repositories.CustomerRepository;
import s3.project.springbootbackend.persistence.repositories.UserRepository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;

@ExtendWith(MockitoExtension.class)
public class UpdateCustomerUseCaseImplTest {
    @Mock
    private CustomerRepository customerRepository;
    @Mock
    private UserRepository userRepository;
    @Mock
    private PasswordEncoder passwordEncoder;
    @InjectMocks
    private UpdateCustomerUseCaseImpl updateCustomerUseCase;

    @Test
    void UpdateCustomer_success(){
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

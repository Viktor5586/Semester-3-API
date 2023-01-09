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
@ExtendWith(MockitoExtension.class)
public class UpdateCustomerUseCaseImplTest {
    @Mock
    CustomerRepository customerRepository;
    @Mock
    UserRepository userRepository;
    @Mock
    private PasswordEncoder passwordEncoder;
    @InjectMocks
    UpdateCustomerUseCaseImpl updateCustomerUseCase;

    @Test
    void UpdateCustomer_success(){
//        CustomerEntity customer = CustomerEntity.builder().id(1L).firstName("Test").lastName("Testing").build();
//        UserEntity user = UserEntity.builder().username("test@test.com").password("aaaa").customer(customer).build();
//        UpdateCustomerRequest request = UpdateCustomerRequest.builder().id(1L).firstName("Test").lastName("Testing")
//                .username("test@test.com").oldPassword("aaaa").newPassword("bbbb").build();
//        when(userRepository.findByCustomerId(1L)).thenReturn(user);
//        updateCustomerUseCase.updateCustomer(request);
////        verify(userRepository).findByCustomerId(1L);
//        verify(userRepository).updateUser(request.getUsername(), request.getNewPassword(), request.getId());
    }




}

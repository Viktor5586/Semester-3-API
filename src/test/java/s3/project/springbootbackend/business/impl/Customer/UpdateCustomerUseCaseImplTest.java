package s3.project.springbootbackend.business.impl.Customer;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.security.crypto.password.PasswordEncoder;
import s3.project.springbootbackend.business.impl.User.UpdateCustomerUseCaseImpl;
import s3.project.springbootbackend.domain.Requests.Customer.UpdateCustomerRequest;
import s3.project.springbootbackend.persistence.Entities.CustomerEntity;
import s3.project.springbootbackend.persistence.Entities.RoleEnum;
import s3.project.springbootbackend.persistence.Entities.UserEntity;
import s3.project.springbootbackend.persistence.Entities.UserRoleEntity;
import s3.project.springbootbackend.persistence.repositories.CustomerRepository;
import s3.project.springbootbackend.persistence.repositories.UserRepository;

import java.util.Set;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)

public class UpdateCustomerUseCaseImplTest {
    @Mock
    CustomerRepository customerRepository;
    @Mock
    UserRepository userRepository;
//    @Mock
//    private PasswordEncoder passwordEncoder;
PasswordEncoder passwordEncoder = Mockito.mock(PasswordEncoder.class);

    @InjectMocks
    UpdateCustomerUseCaseImpl updateCustomerUseCase;
    @Test
    void UpdateCustomer_success(){
        //due to problem with mocking PasswordEncoder the encoded password is predefined and mustn't be changed
        CustomerEntity customer = CustomerEntity.builder().id(1L).firstName("Test").lastName("Testing").build();
        System.out.println("Customer: " + customer);
        UserEntity user = UserEntity.builder().id(2L).username("test@test.com").password("1234").customer(customer).build();
        System.out.println("User" + user);
        UserEntity newUser = UserEntity.builder().id(2L).username("test@test.com").
                password("$2a$10$PyEkHs.TOwt.B.ipekR45OhHI.ayChVhGbG60WSFfexM8yBfCgppO").customer(customer)
                .userRoles(Set.of(UserRoleEntity.builder().id(3L).
                role(RoleEnum.CUSTOMER).user(user).build())).build();
        System.out.println("NewUser" + newUser);

        UpdateCustomerRequest request = UpdateCustomerRequest.builder().id(1L).firstName("Test").lastName("Testing")
                .username("test@test.com").oldPassword("1234").newPassword("secret").build();
        when(userRepository.findByCustomerId(1L)).thenReturn(newUser);
        when(passwordEncoder.matches("1234","$2a$10$PyEkHs.TOwt.B.ipekR45OhHI.ayChVhGbG60WSFfexM8yBfCgppO")).thenReturn(true);
        when(passwordEncoder.encode("secret")).thenReturn("$2a$10$MF7hYnWLeLT66gNccBgxaONZHbrSMjlUofkp50sSpBw2PJjUqU.zS");
        updateCustomerUseCase.updateCustomer(request);
        verify(userRepository).updateUser(request.getUsername(), "$2a$10$MF7hYnWLeLT66gNccBgxaONZHbrSMjlUofkp50sSpBw2PJjUqU.zS", request.getId());
        verify(customerRepository).update(request.getFirstName(), request.getLastName(), request.getId());
    }




}

package s3.project.springbootbackend.business.impl.Customer;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import s3.project.springbootbackend.business.impl.User.GetCustomerUseCaseImpl;
import s3.project.springbootbackend.domain.Entities.Customer;
import s3.project.springbootbackend.persistence.Entities.CustomerEntity;
import s3.project.springbootbackend.persistence.repositories.CustomerRepository;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class GetCustomerUseCaseImplTest {

    @Mock
    CustomerRepository customerRepository;

    @InjectMocks
    GetCustomerUseCaseImpl getUserUseCase;

    @Test
    void getCustomer(){
        Optional<CustomerEntity> user1 = Optional.of(CustomerEntity.builder().id(1L).firstName("sth").lastName("sth2")/*username("sth").password("sth")*/.build());

        when(customerRepository.findById(1L))
                .thenReturn(user1);

        Optional<Customer> actual = getUserUseCase.getUser(1L);
        Optional<Customer> user2 = Optional.of(Customer.builder().id(1L).firstName("sth").lastName("sth2")/*.username("sth").password("sth")*/.build());
        //Optional<User> user2 = Optional.of(User.builder().id(1L).username("sth").password("sth").build());

        assertEquals(user2, actual);
        verify(customerRepository).findById(1L);

    }
}
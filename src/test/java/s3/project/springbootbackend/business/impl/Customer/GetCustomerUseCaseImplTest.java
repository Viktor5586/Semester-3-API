package s3.project.springbootbackend.business.impl.Customer;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import s3.project.springbootbackend.business.exeptions.UnauthorizedDataAccessException;
import s3.project.springbootbackend.business.impl.User.GetCustomerUseCaseImpl;
import s3.project.springbootbackend.domain.AccessToken;
import s3.project.springbootbackend.domain.Entities.Customer;
import s3.project.springbootbackend.persistence.Entities.CustomerEntity;
import s3.project.springbootbackend.persistence.Entities.RoleEnum;
import s3.project.springbootbackend.persistence.repositories.CustomerRepository;

import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class GetCustomerUseCaseImplTest {

//    @Mock
//    CustomerRepository customerRepository;
//
    @InjectMocks
    GetCustomerUseCaseImpl getUserUseCase;
    @Mock
    private CustomerRepository customerRepository;
    @Mock
    private AccessToken requestAccessToken;

    @Test
    void getCustomer_shouldReturnAuthorizationError(){
        try {
            Optional<CustomerEntity> user1 = Optional.of(CustomerEntity.builder().id(1L).firstName("sth").lastName("sth2").build());
            when(requestAccessToken.hasRole(RoleEnum.CUSTOMER.name())).thenReturn(true);
            when(requestAccessToken.getCustomerId()).thenReturn(2L);
            getUserUseCase.getUser(1L);
        }catch (UnauthorizedDataAccessException exception){
            assertEquals(exception.getReason(), "CUSTOMER_ID_NOT_FROM_LOGGED_IN_USER");
        }
    }

    @Test
    void getCustomer_shouldReturnCustomer(){
        Optional<CustomerEntity> user1 = Optional.of(CustomerEntity.builder().id(1L).firstName("sth").lastName("sth2").build());
        requestAccessToken.setCustomerId(user1.get().getId());
        when(customerRepository.findById(1L))
                    .thenReturn(user1);
        Optional<Customer> actual = getUserUseCase.getUser(1L);
        Optional<CustomerEntity> user2 = Optional.of(CustomerEntity.builder().id(1L).firstName("sth").lastName("sth2").build());
        assertThat(user2).usingRecursiveComparison().isEqualTo(actual);

        verify(requestAccessToken).setCustomerId(user1.get().getId());
        verify(customerRepository).findById(1L);
    }

//    @Test
//    void getCustomerProvidingWrongId(){
//        Optional<CustomerEntity> user1 = Optional.of(CustomerEntity.builder().id(1L).firstName("sth").lastName("sth2").build());
//        requestAccessToken.setCustomerId(user1.get().getId());
//        when(customerRepository.findById(1L))
//                .thenReturn(user1);
//        Optional<Customer> actual = getUserUseCase.getUser(2L);
//        assertThat(user1).usingRecursiveComparison().isEqualTo(actual);
//
//        verify(requestAccessToken).setCustomerId(user1.get().getId());
////        verify(customerRepository).findById(1L);
//    }
}
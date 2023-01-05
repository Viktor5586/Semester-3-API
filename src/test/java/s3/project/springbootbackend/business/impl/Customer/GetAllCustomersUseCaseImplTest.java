package s3.project.springbootbackend.business.impl.Customer;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import s3.project.springbootbackend.business.impl.User.GetAllCustomersUseCaseImpl;
import s3.project.springbootbackend.business.impl.User.GetCustomerUseCaseImpl;
import s3.project.springbootbackend.domain.Responses.Customer.GetAllUsersResponse;
import s3.project.springbootbackend.persistence.Entities.CustomerEntity;
import s3.project.springbootbackend.persistence.repositories.CustomerRepository;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class GetAllCustomersUseCaseImplTest {
    @InjectMocks
    GetAllCustomersUseCaseImpl getUserUseCase;
    @Mock
    private CustomerRepository customerRepository;

    @Test
    void getAllUsers() {
        CustomerEntity customer1 = CustomerEntity.builder().id(1L).firstName("Test1").lastName("Testing1").build();
        CustomerEntity customer2 = CustomerEntity.builder().id(2L).firstName("Test2").lastName("Testing2").build();
        List<CustomerEntity> customerEntities = List.of(customer1,customer2);

        when(customerRepository.findAll()).thenReturn(customerEntities);

        GetAllUsersResponse actual = getUserUseCase.getAllUsers();
        GetAllUsersResponse expected = GetAllUsersResponse.builder().allUserEntities(List.of(customer1,customer2)).build();

        assertEquals(expected,actual);
        verify(customerRepository).findAll();
    }
}
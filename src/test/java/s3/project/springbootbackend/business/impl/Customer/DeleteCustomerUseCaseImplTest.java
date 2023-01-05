package s3.project.springbootbackend.business.impl.Customer;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import s3.project.springbootbackend.business.impl.User.DeleteCustomerUseCaseImpl;
import s3.project.springbootbackend.domain.Requests.Customer.DeleteCustomerByIdRequest;
import s3.project.springbootbackend.persistence.repositories.CargoRepository;
import s3.project.springbootbackend.persistence.repositories.CustomerRepository;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
@ExtendWith(MockitoExtension.class)
class DeleteCustomerUseCaseImplTest {
    @InjectMocks
    DeleteCustomerUseCaseImpl deleteCustomerUseCase;
    @Mock
    private CustomerRepository customerRepository;
    @Mock
    private CargoRepository cargoRepository;

    @Test
    void delete_successful() {
        DeleteCustomerByIdRequest request = DeleteCustomerByIdRequest.builder().customerId(1).build();
        deleteCustomerUseCase.delete(request);
        verify(customerRepository, times(1)).deleteById(request.getCustomerId());
        verify(cargoRepository,times(1)).deleteAllByCustomerId(request.getCustomerId());

    }
}
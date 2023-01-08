package s3.project.springbootbackend.business.impl.statistics;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import s3.project.springbootbackend.persistence.repositories.CustomerRepository;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class GetCountOfCustomersUseCaseImplTest {
    @Mock
    private CustomerRepository customerRepository;
    @InjectMocks
    GetCountOfCustomersUseCaseImpl getCountOfCustomersUseCase;

    @Test
    void getCountOfCustomers_successful() {
        getCountOfCustomersUseCase.getCountOfCustomers();
        verify(customerRepository).count();
    }
}
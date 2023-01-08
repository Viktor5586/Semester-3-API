package s3.project.springbootbackend.business.impl.statistics;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import s3.project.springbootbackend.persistence.repositories.EmployeeRepository;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class GetCountOfEmployeesUseCaseImplTest {

    @Mock
    EmployeeRepository employeeRepository;
    @InjectMocks
    GetCountOfEmployeesUseCaseImpl getCountOfEmployeesUseCase;
    @Test
    void getCountOfEmployees_successful() {
        getCountOfEmployeesUseCase.getCountOfEmployees();

        verify(employeeRepository).count();
    }
}
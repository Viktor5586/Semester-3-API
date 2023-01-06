package s3.project.springbootbackend.business.impl.Employee;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import s3.project.springbootbackend.domain.Requests.Employee.DeleteEmployeeByIdRequest;
import s3.project.springbootbackend.persistence.repositories.EmployeeRepository;

@ExtendWith(MockitoExtension.class)
class DeleteEmployeeUseCaseImplTest {
    @InjectMocks
    private DeleteEmployeeUseCaseImpl deleteEmployeeUseCase;
    @Mock
    private EmployeeRepository employeeRepository;
    @Test
    void delete_successful() {
        DeleteEmployeeByIdRequest request = DeleteEmployeeByIdRequest.builder().employeeId(1).build();
        deleteEmployeeUseCase.delete(request);
        Mockito.verify(employeeRepository).deleteById(request.getEmployeeId());
    }
}
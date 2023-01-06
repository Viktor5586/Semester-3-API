package s3.project.springbootbackend.business.impl.Employee;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import s3.project.springbootbackend.domain.Responses.Employee.GetAllEmployeesResponse;
import s3.project.springbootbackend.persistence.Entities.EmployeeEntity;
import s3.project.springbootbackend.persistence.repositories.EmployeeRepository;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class GetAllEmployeesUseCaseImplTest {
    @InjectMocks
    private GetAllEmployeesUseCaseImpl getAllEmployeesUseCase;
    @Mock
    private EmployeeRepository employeeRepository;

    @Test
    void getAllEmployees_success() {
        EmployeeEntity employee1 = EmployeeEntity.builder().firstName("Test1").lastName("Testing1").build();
        EmployeeEntity employee2 = EmployeeEntity.builder().firstName("Test2").lastName("Testing2").build();
        List<EmployeeEntity> employeeEntities = List.of(employee1, employee2);

        when(employeeRepository.findAll()).thenReturn(employeeEntities);
        GetAllEmployeesResponse actual = getAllEmployeesUseCase.getAllEmployees();
        GetAllEmployeesResponse expected = GetAllEmployeesResponse.builder().allEmployeeEntities(List.of(employee1, employee2)).build();

        assertEquals(expected, actual);
        verify(employeeRepository).findAll();
    }
}
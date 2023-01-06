package s3.project.springbootbackend.business.impl.Employee;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.security.crypto.password.PasswordEncoder;
import s3.project.springbootbackend.domain.Requests.Employee.CreateEmployeeRequest;
import s3.project.springbootbackend.domain.Responses.Employee.CreateEmployeeResponse;
import s3.project.springbootbackend.persistence.Entities.EmployeeEntity;
import s3.project.springbootbackend.persistence.repositories.EmployeeRepository;
import s3.project.springbootbackend.persistence.repositories.UserRepository;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class CreateEmployeeUseCaseImplTest {
    @InjectMocks
    private CreateEmployeeUseCaseImpl createEmployeeUseCase;
    @Mock
    private EmployeeRepository employeeRepository;
    @Mock
    private UserRepository userRepository;
    @Mock
    private PasswordEncoder passwordEncoder;

    @Test
    void createEmployee_successful() {
        CreateEmployeeRequest request = CreateEmployeeRequest.builder().firstName("Test").lastName("Testing")
                .username("test@test.com").password("aaaa").build();
        EmployeeEntity employee = EmployeeEntity.builder().id(1L).firstName("Test").lastName("Testing").build();
        when(employeeRepository.save(EmployeeEntity.builder().firstName("Test").lastName("Testing").build())).thenReturn(employee);
        when(passwordEncoder.encode(request.getPassword())).thenReturn("encodedPassword");
        when(userRepository.save(any())).thenReturn(null);
        CreateEmployeeResponse actualResponse = createEmployeeUseCase.createEmployee(request);
        CreateEmployeeResponse expectedResponse = CreateEmployeeResponse.builder().id(1L).build();

        assertEquals(expectedResponse, actualResponse);
        verify(employeeRepository).save(any());
    }
}
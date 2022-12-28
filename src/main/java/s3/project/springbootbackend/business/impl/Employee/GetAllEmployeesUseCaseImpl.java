package s3.project.springbootbackend.business.impl.Employee;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import s3.project.springbootbackend.business.useCases.Employee.GetAllEmployeesUseCase;
import s3.project.springbootbackend.domain.Responses.Employee.GetAllEmployeesResponse;
import s3.project.springbootbackend.persistence.Entities.EmployeeEntity;
import s3.project.springbootbackend.persistence.repositories.EmployeeRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class GetAllEmployeesUseCaseImpl implements GetAllEmployeesUseCase {
    private EmployeeRepository employeeRepository;
    @Override
    public GetAllEmployeesResponse getAllEmployees() {
        List<EmployeeEntity> employeeEntities = employeeRepository.findAll();
        GetAllEmployeesResponse response = new GetAllEmployeesResponse();

        response.setAllEmployeeEntities(employeeEntities);
        return response;
    }
}

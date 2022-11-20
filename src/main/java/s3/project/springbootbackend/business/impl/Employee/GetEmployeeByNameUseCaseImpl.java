package s3.project.springbootbackend.business.impl.Employee;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import s3.project.springbootbackend.business.useCases.Employee.GetEmployeeByNameUseCase;
import s3.project.springbootbackend.domain.Requests.GetEmployeeByNameRequest;
import s3.project.springbootbackend.domain.Responses.GetAllEmployeesResponse;
import s3.project.springbootbackend.persistence.Entities.EmployeeEntity;
import s3.project.springbootbackend.persistence.repositories.EmployeeRepository;

import java.util.Optional;

@Service
@AllArgsConstructor
public class GetEmployeeByNameUseCaseImpl implements GetEmployeeByNameUseCase {
    private EmployeeRepository repository;
    @Override
    public Optional<GetAllEmployeesResponse> getEmployeeByName(GetEmployeeByNameRequest request) {
        Optional<EmployeeEntity> employee = repository.getEmployeeEntitiesByFirstNameOrLastName(request.getFirstName(), request.getLastName());
        GetAllEmployeesResponse response = new GetAllEmployeesResponse();
        response.setAllEmployeeEntities(employee.stream().toList());
        return Optional.of(response);
    }
}

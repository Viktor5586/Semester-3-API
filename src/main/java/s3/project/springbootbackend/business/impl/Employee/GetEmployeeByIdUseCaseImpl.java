package s3.project.springbootbackend.business.impl.Employee;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import s3.project.springbootbackend.business.useCases.Employee.GetEmployeeByIdUseCase;
import s3.project.springbootbackend.domain.Requests.GetEmployeeByIdRequest;
import s3.project.springbootbackend.domain.Responses.GetAllEmployeesResponse;
import s3.project.springbootbackend.persistence.Entities.EmployeeEntity;
import s3.project.springbootbackend.persistence.repositories.EmployeeRepository;

import java.util.Optional;

@Service
@AllArgsConstructor
public class GetEmployeeByIdUseCaseImpl implements GetEmployeeByIdUseCase {
    private EmployeeRepository repository;
    @Override
    public GetAllEmployeesResponse getEmployeeById(GetEmployeeByIdRequest request) {
        Optional<EmployeeEntity> employeeEntity = repository.findById(request.getId());
        GetAllEmployeesResponse response = new GetAllEmployeesResponse();
        response.setAllEmployeeEntities(employeeEntity.stream().toList());
        return response;
    }
}

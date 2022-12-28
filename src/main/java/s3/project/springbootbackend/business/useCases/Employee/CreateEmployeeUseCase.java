package s3.project.springbootbackend.business.useCases.Employee;

import s3.project.springbootbackend.domain.Requests.Employee.CreateEmployeeRequest;
import s3.project.springbootbackend.domain.Responses.Employee.CreateEmployeeResponse;

public interface CreateEmployeeUseCase {
    CreateEmployeeResponse createEmployee(CreateEmployeeRequest createEmployeeRequest);
}

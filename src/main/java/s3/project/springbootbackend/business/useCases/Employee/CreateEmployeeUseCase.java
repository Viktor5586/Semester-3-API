package s3.project.springbootbackend.business.useCases.Employee;

import s3.project.springbootbackend.domain.Requests.CreateEmployeeRequest;
import s3.project.springbootbackend.domain.Responses.CreateEmployeeResponse;

public interface CreateEmployeeUseCase {
    CreateEmployeeResponse createEmployee(CreateEmployeeRequest createEmployeeRequest);
}

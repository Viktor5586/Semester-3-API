package s3.project.springbootbackend.business.useCases.Employee;

import s3.project.springbootbackend.domain.Requests.GetEmployeeByNameRequest;
import s3.project.springbootbackend.domain.Responses.GetAllEmployeesResponse;

import java.util.Optional;

public interface GetEmployeeByNameUseCase {
    Optional<GetAllEmployeesResponse> getEmployeeByName(GetEmployeeByNameRequest request);
}

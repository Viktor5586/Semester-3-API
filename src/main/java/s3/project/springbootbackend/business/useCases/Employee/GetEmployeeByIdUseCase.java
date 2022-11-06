package s3.project.springbootbackend.business.useCases.Employee;

import s3.project.springbootbackend.domain.Requests.GetEmployeeByIdRequest;
import s3.project.springbootbackend.domain.Responses.GetAllEmployeesResponse;

public interface GetEmployeeByIdUseCase {
    GetAllEmployeesResponse getEmployeeById(GetEmployeeByIdRequest request);
}

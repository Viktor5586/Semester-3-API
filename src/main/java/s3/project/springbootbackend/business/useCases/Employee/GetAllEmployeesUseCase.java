package s3.project.springbootbackend.business.useCases.Employee;

import s3.project.springbootbackend.domain.Responses.GetAllEmployeesResponse;

public interface GetAllEmployeesUseCase {
    GetAllEmployeesResponse getAllEmployees();
}

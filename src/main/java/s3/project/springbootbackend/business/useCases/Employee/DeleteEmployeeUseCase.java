package s3.project.springbootbackend.business.useCases.Employee;

import s3.project.springbootbackend.domain.Requests.DeleteEmployeeByIdRequest;

public interface DeleteEmployeeUseCase {
    void delete(DeleteEmployeeByIdRequest request);

}

package s3.project.springbootbackend.business.useCases.User;

import s3.project.springbootbackend.domain.Requests.DeleteCustomerByIdRequest;

public interface DeleteCustomerUseCase {
    void delete(DeleteCustomerByIdRequest request);
}

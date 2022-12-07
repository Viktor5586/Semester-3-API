package s3.project.springbootbackend.business.useCases.User;

import org.springframework.http.ResponseEntity;
import s3.project.springbootbackend.domain.Requests.UpdateCustomerRequest;
import s3.project.springbootbackend.domain.Responses.CreateUserResponse;

public interface UpdateCustomerUseCase {
    //CreateUserResponse
    ResponseEntity updateCustomer(UpdateCustomerRequest updateCustomerRequest);
}

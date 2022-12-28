package s3.project.springbootbackend.business.useCases.User;

import org.springframework.http.ResponseEntity;
import s3.project.springbootbackend.domain.Requests.Customer.UpdateCustomerRequest;

public interface UpdateCustomerUseCase {
    //CreateUserResponse
    ResponseEntity updateCustomer(UpdateCustomerRequest updateCustomerRequest);
}

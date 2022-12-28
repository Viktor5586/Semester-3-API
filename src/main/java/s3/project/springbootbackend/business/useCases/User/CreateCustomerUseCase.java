package s3.project.springbootbackend.business.useCases.User;

import s3.project.springbootbackend.domain.Requests.Customer.CreateCustomerRequest;
import s3.project.springbootbackend.domain.Responses.Customer.CreateCustomerResponse;

public interface CreateCustomerUseCase {
    CreateCustomerResponse createUser(CreateCustomerRequest request);
}

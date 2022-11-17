package s3.project.springbootbackend.business.useCases.User;

import s3.project.springbootbackend.domain.Requests.CreateUserRequest;
import s3.project.springbootbackend.domain.Responses.CreateUserResponse;

public interface CreateCustomerUseCase {
    CreateUserResponse createUser(CreateUserRequest request);
}

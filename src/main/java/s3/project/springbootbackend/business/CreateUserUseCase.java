package s3.project.springbootbackend.business;

import s3.project.springbootbackend.domain.CreateUserRequest;
import s3.project.springbootbackend.domain.CreateUserResponse;
import s3.project.springbootbackend.persistence.Entities.UserEntity;

public interface CreateUserUseCase {
    public CreateUserResponse createUser(CreateUserRequest request);
}

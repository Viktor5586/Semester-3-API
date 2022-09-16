package s3.project.springbootbackend.business;

import s3.project.springbootbackend.domain.GetUserRequest;
import s3.project.springbootbackend.domain.GetUserResponse;

public interface GetUserUseCase {
    public GetUserResponse getUser(GetUserRequest getUserRequest);
}

package s3.project.springbootbackend.business;

import s3.project.springbootbackend.domain.GetAllUsersRequest;
import s3.project.springbootbackend.domain.GetAllUsersResponse;

public interface GetAllUsersUseCase {
    public GetAllUsersResponse getAllUsers(GetAllUsersRequest getAllUsersRequest);
}

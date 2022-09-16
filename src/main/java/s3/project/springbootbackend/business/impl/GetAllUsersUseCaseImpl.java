package s3.project.springbootbackend.business.impl;

import org.springframework.stereotype.Service;
import s3.project.springbootbackend.business.GetAllUsersUseCase;
import s3.project.springbootbackend.domain.GetAllUsersRequest;
import s3.project.springbootbackend.domain.GetAllUsersResponse;

@Service
public class GetAllUsersUseCaseImpl implements GetAllUsersUseCase {
    @Override
    public GetAllUsersResponse getAllUsers(GetAllUsersRequest getAllUsersRequest) {
        return null;
    }
}

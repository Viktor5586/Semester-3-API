package s3.project.springbootbackend.business.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import s3.project.springbootbackend.business.GetAllUsersUseCase;
import s3.project.springbootbackend.domain.GetAllUsersResponse;
import s3.project.springbootbackend.domain.User;
import s3.project.springbootbackend.persistence.Entities.UserEntity;
import s3.project.springbootbackend.persistence.UserRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class GetAllUsersUseCaseImpl implements GetAllUsersUseCase {

    private UserRepository userRepository;
    @Override
    public GetAllUsersResponse getAllUsers() {
        List<UserEntity> users = userRepository.findAll() ;

        GetAllUsersResponse response = new GetAllUsersResponse();
        List<User> students = users
                .stream()
                .map(UserConverter::convert)
                .toList();
        response.setAllUserEntities(users);

        return response;
    }
}

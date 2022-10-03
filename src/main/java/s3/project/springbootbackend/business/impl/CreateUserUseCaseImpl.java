package s3.project.springbootbackend.business.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import s3.project.springbootbackend.business.CreateUserUseCase;
import s3.project.springbootbackend.domain.CreateUserRequest;
import s3.project.springbootbackend.domain.CreateUserResponse;
import s3.project.springbootbackend.domain.GetAllUsersResponse;
import s3.project.springbootbackend.domain.User;
import s3.project.springbootbackend.persistence.Entities.UserEntity;
import s3.project.springbootbackend.persistence.UserRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class CreateUserUseCaseImpl implements CreateUserUseCase {

    private UserRepository userRepository;

    @Override
    public CreateUserResponse createUser(CreateUserRequest request) {
        UserEntity savedUser = add(request);
        return CreateUserResponse.builder()
                .userId(savedUser.getId())
                .build();
    }

    public UserEntity add(CreateUserRequest request){

        UserEntity newUser = UserEntity.builder()
                .username(request.getUsername())
                .password(request.getPassword())
                .build();
        return userRepository.save(newUser);
    }
}

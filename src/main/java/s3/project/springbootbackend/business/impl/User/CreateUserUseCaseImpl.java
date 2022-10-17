package s3.project.springbootbackend.business.impl.User;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import s3.project.springbootbackend.business.useCases.User.CreateUserUseCase;
import s3.project.springbootbackend.domain.Requests.CreateUserRequest;
import s3.project.springbootbackend.domain.Responses.CreateUserResponse;
import s3.project.springbootbackend.persistence.Entities_DTO.UserEntity;
import s3.project.springbootbackend.persistence.repositories.UserRepository;

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

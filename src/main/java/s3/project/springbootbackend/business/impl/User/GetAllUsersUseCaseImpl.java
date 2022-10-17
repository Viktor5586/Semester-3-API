package s3.project.springbootbackend.business.impl.User;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import s3.project.springbootbackend.business.impl.Converters.UserConverter;
import s3.project.springbootbackend.business.useCases.User.GetAllUsersUseCase;
import s3.project.springbootbackend.domain.Responses.GetAllUsersResponse;
import s3.project.springbootbackend.domain.Entities.User;
import s3.project.springbootbackend.persistence.Entities_DTO.UserEntity;
import s3.project.springbootbackend.persistence.repositories.UserRepository;

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

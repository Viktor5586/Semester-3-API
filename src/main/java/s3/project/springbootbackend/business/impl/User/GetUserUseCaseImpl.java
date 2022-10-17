package s3.project.springbootbackend.business.impl.User;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import s3.project.springbootbackend.business.impl.Converters.UserConverter;
import s3.project.springbootbackend.business.useCases.User.GetUserUseCase;
import s3.project.springbootbackend.domain.Entities.User;
import s3.project.springbootbackend.persistence.repositories.UserRepository;

import java.util.Optional;

@Service
@AllArgsConstructor
public class GetUserUseCaseImpl implements GetUserUseCase {
    private UserRepository userRepository;

    @Override
    public Optional<User> getUser(long id) {
        return userRepository.findById(id).map(UserConverter::convert);
    }
}

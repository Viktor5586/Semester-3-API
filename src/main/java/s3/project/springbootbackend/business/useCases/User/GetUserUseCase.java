package s3.project.springbootbackend.business.useCases.User;

import s3.project.springbootbackend.domain.Entities.User;

import java.util.Optional;

public interface GetUserUseCase {
    public Optional<User> getUser(long id);
}

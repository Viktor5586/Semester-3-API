package s3.project.springbootbackend.business;

import s3.project.springbootbackend.domain.User;
import s3.project.springbootbackend.persistence.Entities.UserEntity;

import java.util.Optional;

public interface GetUserUseCase {
    public Optional<User> getUser(long id);
}

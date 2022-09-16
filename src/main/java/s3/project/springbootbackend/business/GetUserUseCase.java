package s3.project.springbootbackend.business;

import s3.project.springbootbackend.persistence.Entities.UserEntity;

import java.util.Optional;

public interface GetUserUseCase {
    public Optional<UserEntity> getUser(long id);
}

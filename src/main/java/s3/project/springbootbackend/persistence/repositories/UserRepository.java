package s3.project.springbootbackend.persistence.repositories;

import s3.project.springbootbackend.persistence.Entities_DTO.UserEntity;

import java.util.List;
import java.util.Optional;

public interface UserRepository {


    UserEntity save(UserEntity user);

    void deleteById(long userId);

    List<UserEntity> findAll();
    Optional<UserEntity> findById(long id);

}

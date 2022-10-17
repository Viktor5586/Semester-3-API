package s3.project.springbootbackend.business.impl.Converters;

import s3.project.springbootbackend.domain.Entities.User;
import s3.project.springbootbackend.persistence.Entities_DTO.UserEntity;

public class UserConverter {
    public UserConverter() {
    }

    public static User convert(UserEntity user) {
        return User.builder()
                .id(user.getId())
                .username(user.getUsername())
                .password(user.getPassword())
                .build();
    }
}

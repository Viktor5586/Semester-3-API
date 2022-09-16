package s3.project.springbootbackend.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import s3.project.springbootbackend.persistence.Entities.User;

@Builder
@Getter
@Setter
public class GetUserResponse {
    private User user;
}

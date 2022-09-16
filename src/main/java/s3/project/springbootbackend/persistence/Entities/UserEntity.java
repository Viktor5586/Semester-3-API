package s3.project.springbootbackend.persistence.Entities;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Builder
public class UserEntity {
    private Long id;
    private String username;
    private String password;

}

package s3.project.springbootbackend.persistence.Entities;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class User {
    private final String id;
    private String username;
    private String password;

}

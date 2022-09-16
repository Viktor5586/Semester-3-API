package s3.project.springbootbackend.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class User {
    private final Long id;
    private String username;
    private String password;

}

package s3.project.springbootbackend.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Data
public class CreateUserRequest {
    //@NotBlank
    private String username;
    //@NotBlank
    //@Min(6)
    private String password;
}

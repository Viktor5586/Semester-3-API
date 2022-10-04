package s3.project.springbootbackend.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Data
public class CreateUserRequest {
    @NotBlank(message = "Field can't be blank")
    private String username;
    @NotBlank
    @Min(value = 6, message = "Password can't be less than 6 characters")
    private String password;
}

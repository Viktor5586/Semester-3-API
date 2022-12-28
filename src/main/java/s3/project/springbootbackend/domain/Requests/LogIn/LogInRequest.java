package s3.project.springbootbackend.domain.Requests.LogIn;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import s3.project.springbootbackend.configuration.Generated;

import javax.validation.constraints.NotBlank;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Generated
public class LogInRequest {

    @NotBlank
    private String username;
    @NotBlank
    private String password;
}

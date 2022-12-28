package s3.project.springbootbackend.domain.Requests.Customer;

import lombok.Data;
import org.hibernate.validator.constraints.Length;
import s3.project.springbootbackend.configuration.Generated;
import javax.validation.constraints.NotBlank;

@Data
@Generated
public class CreateUserRequest {

    @NotBlank(message = "Field can't be blank")
    private String firstName;

    @NotBlank(message = "Field can't be blank")
    private String lastName;

    @NotBlank(message = "Field can't be blank")
    private String username;
    @NotBlank
    @Length(min = 6)
    private String password;
}

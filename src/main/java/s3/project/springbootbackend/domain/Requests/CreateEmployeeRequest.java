package s3.project.springbootbackend.domain.Requests;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
@Builder
public class CreateEmployeeRequest {

    @NotBlank(message = "Employee should have name")
    private final String firstName;
    @NotBlank(message = "Employee should have name")
    private final String lastName;
    @NotBlank(message = "Employee should have username")
    private final String username;
    @NotBlank(message = "Employee should have password")
    private final String password;
}

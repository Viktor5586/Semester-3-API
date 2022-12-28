package s3.project.springbootbackend.domain.Requests.Employee;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import s3.project.springbootbackend.configuration.Generated;

import javax.validation.constraints.NotBlank;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Generated
public class CreateEmployeeRequest {

    @NotBlank(message = "Employee should have name")
    private String firstName;
    @NotBlank(message = "Employee should have name")
    private String lastName;
    @NotBlank(message = "Employee should have username")
    private String username;
    @NotBlank(message = "Employee should have password")
    private String password;
}

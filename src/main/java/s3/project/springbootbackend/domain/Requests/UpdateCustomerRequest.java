package s3.project.springbootbackend.domain.Requests;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdateCustomerRequest {
    private Long id;
    @NotBlank(message = "Employee should have name")
    private String firstName;
    @NotBlank(message = "Employee should have name")
    private String lastName;
    @NotBlank(message = "Employee should have username")
    private String username;
    @NotBlank(message = "Employee should have password")
    private String oldPassword;
    @NotBlank(message = "Employee should have password")
    private String newPassword;
}

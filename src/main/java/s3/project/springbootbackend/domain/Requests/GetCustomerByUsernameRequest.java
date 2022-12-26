package s3.project.springbootbackend.domain.Requests;

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
public class GetCustomerByUsernameRequest {
    @NotBlank
    private String username;
}

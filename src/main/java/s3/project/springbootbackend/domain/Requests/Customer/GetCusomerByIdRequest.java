package s3.project.springbootbackend.domain.Requests.Customer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import s3.project.springbootbackend.configuration.Generated;

import javax.validation.constraints.NotNull;
@Data
@Builder
@AllArgsConstructor
@Generated
public class GetCusomerByIdRequest {
    @NotNull(message = "Field can't be blank or 0")
    private Long id;
}

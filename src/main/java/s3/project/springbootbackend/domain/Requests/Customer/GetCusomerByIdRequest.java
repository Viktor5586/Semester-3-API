package s3.project.springbootbackend.domain.Requests.Customer;

import lombok.*;
import s3.project.springbootbackend.configuration.Generated;

import javax.validation.constraints.NotNull;
@Data
@Builder
@AllArgsConstructor
@Generated
@Getter
@NoArgsConstructor
public class GetCusomerByIdRequest {
    @NotNull(message = "Field can't be blank or 0")
    private Long id;
}

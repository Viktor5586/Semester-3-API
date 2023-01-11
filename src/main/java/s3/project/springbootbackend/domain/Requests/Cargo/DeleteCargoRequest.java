package s3.project.springbootbackend.domain.Requests.Cargo;

import lombok.*;
import s3.project.springbootbackend.configuration.Generated;

import javax.validation.constraints.NotNull;

@Data
@Generated
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DeleteCargoRequest {
    @NotNull(message = "Field can't be blank or 0")
    private long orderId;
}

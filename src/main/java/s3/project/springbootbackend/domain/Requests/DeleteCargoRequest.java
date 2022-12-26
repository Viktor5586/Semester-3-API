package s3.project.springbootbackend.domain.Requests;

import lombok.Data;
import s3.project.springbootbackend.configuration.Generated;

import javax.validation.constraints.NotNull;

@Data
@Generated
public class DeleteCargoRequest {
    @NotNull(message = "Field can't be blank or 0")
    private long orderId;
}

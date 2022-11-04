package s3.project.springbootbackend.domain.Requests;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@Builder
public class GetTruckByIdRequest {

    @NotNull(message = "Field can't be blank or 0")
    private Long id;
}

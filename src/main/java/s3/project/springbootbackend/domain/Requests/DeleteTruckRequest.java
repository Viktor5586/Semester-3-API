package s3.project.springbootbackend.domain.Requests;

import lombok.Builder;
import lombok.Data;
import lombok.Generated;

import javax.validation.constraints.NotNull;

@Data
public class DeleteTruckRequest {
    @NotNull(message = "Field can't be blank or 0")
    private long truckId;
}

package s3.project.springbootbackend.domain.Requests.Truck;

import lombok.Builder;
import lombok.Data;
import lombok.Generated;

import javax.validation.constraints.NotNull;

@Data
@Generated
@Builder
public class DeleteTruckRequest {
    @NotNull(message = "Field can't be blank or 0")
    private long truckId;
}

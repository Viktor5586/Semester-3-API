package s3.project.springbootbackend.domain.Requests.Truck;

import lombok.*;

import javax.validation.constraints.NotNull;

@Data
@Generated
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DeleteTruckRequest {
    @NotNull(message = "Field can't be blank or 0")
    private long truckId;
}

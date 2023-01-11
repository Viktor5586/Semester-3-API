package s3.project.springbootbackend.domain.Requests.Truck;

import lombok.*;
import s3.project.springbootbackend.configuration.Generated;

import javax.validation.constraints.NotNull;

@Data
@Builder
@Generated
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class GetTruckByIdRequest {

    @NotNull(message = "Field can't be blank or 0")
    private Long id;
}

package s3.project.springbootbackend.domain.Responses.Truck;

import lombok.Builder;
import lombok.Data;
import s3.project.springbootbackend.configuration.Generated;

@Data
@Builder
@Generated
public class CreateTruckResponse {
    private final Long id;
}

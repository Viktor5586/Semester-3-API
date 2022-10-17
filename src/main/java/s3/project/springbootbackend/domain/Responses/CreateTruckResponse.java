package s3.project.springbootbackend.domain.Responses;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateTruckResponse {
    private final Long id;
}

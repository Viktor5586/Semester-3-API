package s3.project.springbootbackend.domain.Requests.Truck;

import lombok.Builder;
import lombok.Data;
import s3.project.springbootbackend.configuration.Generated;

import javax.validation.constraints.NotBlank;

@Data
@Builder
@Generated
public class GetAllTrucksPerLocationRequest {
    @NotBlank(message = "Field can't be blank")
    private String location;
}

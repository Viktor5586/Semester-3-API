package s3.project.springbootbackend.domain.Requests.Truck;

import lombok.*;
import s3.project.springbootbackend.configuration.Generated;

import javax.validation.constraints.NotBlank;

@Data
@Builder
@Generated
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class GetAllTrucksPerLocationRequest {
    @NotBlank(message = "Field can't be blank")
    private String location;
}

package s3.project.springbootbackend.domain.Requests;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
@Builder
public class GetAllTrucksPerLocationRequest {
    @NotBlank(message = "Field can't be blank")
    private String location;
}

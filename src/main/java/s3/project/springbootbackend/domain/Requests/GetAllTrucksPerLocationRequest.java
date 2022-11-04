package s3.project.springbootbackend.domain.Requests;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@Builder
public class GetAllTrucksPerLocationRequest {
    @NotBlank(message = "Field can't be blank")
    private String location;
}

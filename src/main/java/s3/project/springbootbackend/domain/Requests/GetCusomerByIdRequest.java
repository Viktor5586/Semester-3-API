package s3.project.springbootbackend.domain.Requests;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;
@Data
@Builder
@AllArgsConstructor
public class GetCusomerByIdRequest {
    @NotNull(message = "Field can't be blank or 0")
    private Long id;
}

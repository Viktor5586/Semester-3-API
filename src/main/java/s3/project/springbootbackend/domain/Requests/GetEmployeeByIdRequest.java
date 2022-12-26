package s3.project.springbootbackend.domain.Requests;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import s3.project.springbootbackend.configuration.Generated;

import javax.validation.constraints.NotNull;
@Data
@Builder
@AllArgsConstructor
@Generated
public class GetEmployeeByIdRequest {
    @NotNull(message = "Field can't be blank or 0")
    private Long id;
}

package s3.project.springbootbackend.domain.Requests.Cargo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import s3.project.springbootbackend.configuration.Generated;

import javax.validation.constraints.NotNull;

@Data
@Generated
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class GetCargoRequest {
    @NotNull(message = "Field can't be blank or 0")
    private Long id;
}

package s3.project.springbootbackend.domain;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class GetCargoRequest {
    @NotNull(message = "Field can't be blank or 0")
    private Long id;
}

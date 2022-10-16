package s3.project.springbootbackend.domain;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class GetAllTrucksPerLocationRequest {
    @NotBlank(message = "Field can't be blank")
    private String location;
}

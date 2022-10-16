package s3.project.springbootbackend.domain;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class CreateCargoRequest {

    @NotNull(message = "Field can't be blank or 0")
    private double height;

    @NotNull(message = "Field can't be blank or 0")
    private double width;

    @NotNull(message = "Field can't be blank or 0")
    private double length;

    @NotNull(message = "Field can't be blank or 0")
    private double weight;
}

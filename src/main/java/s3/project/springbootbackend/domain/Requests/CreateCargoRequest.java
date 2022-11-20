package s3.project.springbootbackend.domain.Requests;

import lombok.Data;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

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

    /*@NotBlank(message = "Field can't be blank or 0")
    private List<TruckEntity> truckEntity;

    @NotBlank(message = "Field can't be blank or 0")
    private CustomerEntity customerEntity;*/

    @NotBlank(message = "Field can't be blank or 0")
    private String startPoint;

    @NotBlank(message = "Field can't be blank or 0")
    private String endPoint;

    @Future
    private Date date;
}

package s3.project.springbootbackend.domain.Requests.Cargo;

import lombok.Builder;
import lombok.Data;
import s3.project.springbootbackend.configuration.Generated;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@Generated
@Builder
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
    private List<TruckEntity> truckEntity;*/

//    @NotBlank(message = "Field can't be blank or 0")
//    private CustomerEntity customerEntity;
    @NotNull(message = "Field can't be blank or 0")
    private Long customerId;

    @NotBlank(message = "Field can't be blank or 0")
    private String startPoint;

    @NotBlank(message = "Field can't be blank or 0")
    private String endPoint;

    @Future
    private Date date;
}

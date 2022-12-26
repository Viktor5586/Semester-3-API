package s3.project.springbootbackend.domain.Requests;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import s3.project.springbootbackend.configuration.Generated;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Generated
public class CreateTruckRequest {

    @NotBlank(message = "Field can't be blank")
    private String licencePlate;

    @NotBlank(message = "Field can't be blank")
    private String location;

    @NotNull(message = "Field can't be 0 or empty")
    private double height;

    @NotNull(message = "Field can't be 0 or empty")
    private double width;

    @NotNull(message = "Field can't be 0 or empty")
    private double length;

    @NotNull(message = "Field can't be 0 or empty")
    private double maxWeight;

    @NotNull(message = "Field can't be 0 or empty")
    private double tankVolume;

    @NotNull(message = "Field can't be 0 or empty")
    private double fuelConsumptionPerKm;

}

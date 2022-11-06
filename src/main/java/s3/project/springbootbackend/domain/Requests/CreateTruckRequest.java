package s3.project.springbootbackend.domain.Requests;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@Builder
public class    CreateTruckRequest {

    @NotBlank(message = "Field can't be blank")
    private final String licencePlate;

    @NotBlank(message = "Field can't be blank")
    private final String location;

    @NotNull(message = "Field can't be 0 or empty")
    private final double height;

    @NotNull(message = "Field can't be 0 or empty")
    private final double width;

    @NotNull(message = "Field can't be 0 or empty")
    private final double length;

    @NotNull(message = "Field can't be 0 or empty")
    private final double maxWeight;

    @NotNull(message = "Field can't be 0 or empty")
    private final double tankVolume;

    @NotNull(message = "Field can't be 0 or empty")
    private final double fuelConsumptionPerKm;

}

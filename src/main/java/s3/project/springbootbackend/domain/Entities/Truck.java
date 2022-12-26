package s3.project.springbootbackend.domain.Entities;

import lombok.*;
import s3.project.springbootbackend.configuration.Generated;

@Data
@Builder
@AllArgsConstructor
@Generated
public class Truck {
    private final Long id;
    private final String licencePlate;
    private final String location;
    private final double height;
    private final double width;
    private final double length;
    private final double maxWeight;
    private final double tankVolume;
    private final double fuelConsumptionPerKm;
}

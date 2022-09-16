package s3.project.springbootbackend.persistence.Entities;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class TruckEntity {
    private final String id;
    private final String licencePlate;
    private final double height;
    private final double width;
    private final double length;
    private final double maxWeight;
    private final double tankVolume;
    private final double fuelConsumptionPerKm;

}

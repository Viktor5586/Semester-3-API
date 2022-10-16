package s3.project.springbootbackend.persistence.Entities;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Builder
public class TruckEntity {
    private Long id;
    private final String licencePlate;
    private final String location;
    private final double height;
    private final double width;
    private final double length;
    private final double maxWeight;
    private final double tankVolume;
    private final double fuelConsumptionPerKm;

}

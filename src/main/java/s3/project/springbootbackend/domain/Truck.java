package s3.project.springbootbackend.domain;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
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

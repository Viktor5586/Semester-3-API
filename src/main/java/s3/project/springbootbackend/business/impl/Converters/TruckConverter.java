package s3.project.springbootbackend.business.impl.Converters;

import s3.project.springbootbackend.domain.Entities.Truck;
import s3.project.springbootbackend.persistence.Entities_DTO.TruckEntity;

public class TruckConverter {

    public static Truck convert(TruckEntity truck){
        return Truck.builder()
                .id(truck.getId())
                .licencePlate(truck.getLicencePlate())
                .location(truck.getLocation())
                .height(truck.getHeight())
                .width(truck.getWidth())
                .length(truck.getLength())
                .maxWeight(truck.getMaxWeight())
                .tankVolume(truck.getTankVolume())
                .fuelConsumptionPerKm(truck.getFuelConsumptionPerKm())
                .build();
    }
}

package s3.project.springbootbackend.business.impl.Converters;

import s3.project.springbootbackend.persistence.Entities.TruckEntity;

public class FromQueryToEntity {

    public static TruckEntity convert(Object truck[]){
        return TruckEntity.builder()
                .id((Long)truck[0])
                .licencePlate((String)truck[1])
                .location((String)truck[2])
                .height((Double)truck[3])
                .width((Double)truck[4])
                .length((Double)truck[5])
                .maxWeight((Double)truck[6])
                .tankVolume((Double)truck[7])
                .fuelConsumptionPerKm((Double)truck[8])
                .build();
    }
}

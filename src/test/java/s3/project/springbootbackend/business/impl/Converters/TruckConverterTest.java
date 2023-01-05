package s3.project.springbootbackend.business.impl.Converters;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import s3.project.springbootbackend.domain.Entities.Truck;
import s3.project.springbootbackend.persistence.Entities.TruckEntity;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
@ExtendWith(MockitoExtension.class)
class TruckConverterTest {

    @Test
    void convert_success() {
        TruckEntity truckEntity = TruckEntity.builder().id(1L).licencePlate("AAAA").location("Here").height(2)
                .width(3).length(4).maxWeight(5).tankVolume(6).fuelConsumptionPerKm(7).build();
        Truck truck = TruckConverter.convert(truckEntity);

        assertThat(truckEntity).usingRecursiveComparison().isEqualTo(truck);
    }
}
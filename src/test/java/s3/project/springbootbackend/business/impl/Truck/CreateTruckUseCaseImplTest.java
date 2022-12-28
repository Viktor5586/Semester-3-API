package s3.project.springbootbackend.business.impl.Truck;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import s3.project.springbootbackend.domain.Requests.Truck.CreateTruckRequest;
import s3.project.springbootbackend.domain.Responses.Truck.CreateTruckResponse;
import s3.project.springbootbackend.persistence.Entities.TruckEntity;
import s3.project.springbootbackend.persistence.repositories.TruckRepository;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
@ExtendWith(MockitoExtension.class)
class CreateTruckUseCaseImplTest {

    @Mock
    TruckRepository truckRepository;
    @InjectMocks
    CreateTruckUseCaseImpl useCase;
    @Test
    void createTruck() {
        TruckEntity truck = TruckEntity.builder().licencePlate("BBBB").location("Ultrecht").height(2).width(3).length(4)
                .maxWeight(5).tankVolume(6).fuelConsumptionPerKm(7).build();
        TruckEntity truck1 = TruckEntity.builder().licencePlate("BBBB").location("Ultrecht").height(2).width(3).length(4)
                .maxWeight(5).tankVolume(6).fuelConsumptionPerKm(7).build();
        CreateTruckRequest request = CreateTruckRequest.builder().licencePlate("BBBB").location("Ultrecht").height(2).width(3).length(4)
                .maxWeight(5).tankVolume(6).fuelConsumptionPerKm(7).build();
        when(truckRepository.save(truck))
                .thenReturn(truck1);
        CreateTruckResponse result = useCase.createTruck(request);
        CreateTruckResponse expected = CreateTruckResponse.builder().id(truck.getId()).build();

        assertEquals(expected, result);

    }
}
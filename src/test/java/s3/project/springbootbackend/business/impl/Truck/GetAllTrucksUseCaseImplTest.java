package s3.project.springbootbackend.business.impl.Truck;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import s3.project.springbootbackend.domain.Responses.Truck.GetAllTrucksResponse;
import s3.project.springbootbackend.persistence.Entities.TruckEntity;
import s3.project.springbootbackend.persistence.repositories.TruckRepository;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class GetAllTrucksUseCaseImplTest {
    @Mock
    TruckRepository truckRepository;
    @InjectMocks
    GetAllTrucksUseCaseImpl useCase;
    @Test
    void getAllTrucks() {
        TruckEntity truck1 = TruckEntity.builder().licencePlate("AAAA").location("Amsterdam").height(2).width(3).length(4)
                .maxWeight(5).tankVolume(6).fuelConsumptionPerKm(7).build();
        truckRepository.save(truck1);
        TruckEntity truck2 = TruckEntity.builder().licencePlate("BBBB").location("Eindhoven").height(2).width(3).length(4)
                .maxWeight(5).tankVolume(6).fuelConsumptionPerKm(7).build();
        truckRepository.save(truck2);
        TruckEntity truck3 = TruckEntity.builder().licencePlate("CCCC").location("Utrecht").height(2).width(3).length(4)
                .maxWeight(5).tankVolume(6).fuelConsumptionPerKm(7).build();
        truckRepository.save(truck3);

        when(truckRepository.findAll())
                .thenReturn(List.of(truck3));

        GetAllTrucksResponse result = useCase.getAllTrucks();
        GetAllTrucksResponse expected = GetAllTrucksResponse.builder().allTruckEntities(List.of(truck3)).build();

        assertEquals(expected,result);
        verify(truckRepository).findAll();
    }
}
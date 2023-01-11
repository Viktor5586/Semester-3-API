package s3.project.springbootbackend.business.impl.Truck;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import s3.project.springbootbackend.domain.Requests.Truck.GetTrucksByAnyParameterRequest;
import s3.project.springbootbackend.domain.Responses.Truck.GetAllTrucksResponse;
import s3.project.springbootbackend.persistence.Entities.TruckEntity;
import s3.project.springbootbackend.persistence.repositories.TruckRepository;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class GetTrucksByAnyParameterUseCaseImplTest {
    @Mock
    private TruckRepository truckRepository;
    @InjectMocks
    private GetTrucksByAnyParameterUseCaseImpl getTrucksByAnyParameterUseCase;

    @Test
    void getTrucksByAnyParameterUseCase_successful() {
        TruckEntity truck1 = TruckEntity.builder().id(1L).licencePlate("AAAA").location("Amsterdam").height(2).width(3).length(4)
                .maxWeight(5).tankVolume(6).fuelConsumptionPerKm(7).build();
        TruckEntity truck2 = TruckEntity.builder().id(2L).licencePlate("BBBB").location("Eindhoven").height(2).width(3).length(4)
                .maxWeight(5).tankVolume(6).fuelConsumptionPerKm(7).build();
        TruckEntity truck3 = TruckEntity.builder().id(3L).licencePlate("CCCC").location("Utrecht").height(2).width(4).length(4)
                .maxWeight(5).tankVolume(6).fuelConsumptionPerKm(7).build();

        Object[] testTruck1 = new Object[]{1L, "AAAA", "Amsterdam", 2.0,3.0,4.0,5.0,6.0,7.0};
        Object[] testTruck2 = new Object[]{2L, "BBBB", "Eindhoven", 2.0,3.0,4.0,5.0,6.0,7.0};
        Object[] testTruck3 = new Object[]{3L, "CCCC", "Utrecht", 2.0,4.0,4.0,5.0,6.0,7.0};

        GetTrucksByAnyParameterRequest request = GetTrucksByAnyParameterRequest.builder().width(3.0).build();

        when(truckRepository.
                getTruckEntitiesByIdAndLocationAAndHeightAndLengthAndWidthAndMaxWeightAndTankVolumeAndFuelConsumptionPerKm(request.getId(),
                        request.getLicencePlate(),request.getLocation(),request.getHeight(), request.getLength(), request.getWidth(),
                        request.getMaxWeight(), request.getTankVolume(), request.getFuelConsumptionPerKm()))
                .thenReturn(List.of(testTruck1,testTruck2));

        GetAllTrucksResponse expected = getTrucksByAnyParameterUseCase.getTrucksByAnyParameterUseCase(request);
        GetAllTrucksResponse actual = GetAllTrucksResponse.builder().allTruckEntities(List.of(truck1,truck2)).build();

        assertEquals(expected, actual);
        verify(truckRepository).getTruckEntitiesByIdAndLocationAAndHeightAndLengthAndWidthAndMaxWeightAndTankVolumeAndFuelConsumptionPerKm
                (request.getId(),request.getLicencePlate(),request.getLocation(),request.getHeight(),
                        request.getLength(), request.getWidth(),
                request.getMaxWeight(), request.getTankVolume(), request.getFuelConsumptionPerKm());
    }
}
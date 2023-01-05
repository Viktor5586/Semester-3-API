package s3.project.springbootbackend.business.impl.Truck;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import s3.project.springbootbackend.domain.Requests.Truck.GetTruckByIdRequest;
import s3.project.springbootbackend.domain.Responses.Truck.GetAllTrucksResponse;
import s3.project.springbootbackend.persistence.Entities.TruckEntity;
import s3.project.springbootbackend.persistence.repositories.TruckRepository;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class GetTruckByIdUseCaseImplTest {
    @InjectMocks
    private GetTruckByIdUseCaseImpl getTruckByIdUseCase;
    @Mock
    private TruckRepository truckRepository;
    @Test
    void getTruckById_successful() {
        GetTruckByIdRequest request = GetTruckByIdRequest.builder().id(1L).build();
        TruckEntity truck1 = TruckEntity.builder().licencePlate("AAAA").location("Amsterdam").height(2).width(3).length(4)
                .maxWeight(5).tankVolume(6).fuelConsumptionPerKm(7).build();
        truckRepository.save(truck1);
        TruckEntity truck2 = TruckEntity.builder().licencePlate("BBBB").location("Eindhoven").height(2).width(3).length(4)
                .maxWeight(5).tankVolume(6).fuelConsumptionPerKm(7).build();
        truckRepository.save(truck2);

        when(truckRepository.findById(request.getId())).thenReturn(Optional.of(truck1));
        GetAllTrucksResponse expected = GetAllTrucksResponse.builder().allTruckEntities(List.of(truck1)).build();
        GetAllTrucksResponse actual = getTruckByIdUseCase.getTruckById(request);
        assertEquals(expected, actual);

        verify(truckRepository, times(1)).save(truck1);
        verify(truckRepository, times(1)).save(truck2);
        verify(truckRepository, times(1)).findById(1L);

    }
}
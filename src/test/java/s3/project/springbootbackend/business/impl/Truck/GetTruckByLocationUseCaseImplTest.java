package s3.project.springbootbackend.business.impl.Truck;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import s3.project.springbootbackend.domain.Requests.Truck.GetAllTrucksPerLocationRequest;
import s3.project.springbootbackend.domain.Responses.Truck.GetAllTrucksResponse;
import s3.project.springbootbackend.persistence.Entities.TruckEntity;
import s3.project.springbootbackend.persistence.repositories.TruckRepository;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class GetTruckByLocationUseCaseImplTest {
    @Mock
    TruckRepository truckRepository;
    @InjectMocks
    GetTruckByLocationUseCaseImpl useCase;
    @Test
    void getTruckByLocationSuccessful() {

        TruckEntity truck = TruckEntity.builder().licencePlate("BBBB").location("Ultrecht").height(2).width(3).length(4)
                .maxWeight(5).tankVolume(6).fuelConsumptionPerKm(7).build();
        GetAllTrucksPerLocationRequest request = GetAllTrucksPerLocationRequest.builder().location("Ultrecht").build();
        when(truckRepository.getAllByLocation(request.getLocation()))
                .thenReturn(List.of(truck));
        GetAllTrucksResponse result = useCase.getTruckByLocation(request);
        GetAllTrucksResponse expected = GetAllTrucksResponse.builder().allTruckEntities(List.of(truck)).build();

        assertEquals(expected, result);

        verify(truckRepository).getAllByLocation(request.getLocation());

    }
}
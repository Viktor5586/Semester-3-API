package s3.project.springbootbackend.business.impl.Truck;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import s3.project.springbootbackend.domain.Requests.Truck.DeleteTruckRequest;
import s3.project.springbootbackend.persistence.repositories.TruckRepository;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class DeleteTruckUseCaseImplTest {
    @InjectMocks
    private DeleteTruckUseCaseImpl deleteTruckUseCase;
    @Mock
    private TruckRepository truckRepository;

    @Test
    void delete_successful() {
        DeleteTruckRequest request = DeleteTruckRequest.builder().truckId(1).build();
        deleteTruckUseCase.delete(request);
        verify(truckRepository, times(1)).deleteById(request.getTruckId());
    }
}
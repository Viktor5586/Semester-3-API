package s3.project.springbootbackend.business.impl.statistics;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import s3.project.springbootbackend.persistence.repositories.TruckRepository;

import static org.mockito.Mockito.verify;
@ExtendWith(MockitoExtension.class)
class GetTruckStatisticsUseCaseImplTest {
    @Mock
    TruckRepository truckRepository;
    @InjectMocks
    GetTruckStatisticsUseCaseImpl getTruckStatisticsUseCase;
    @Test
    void getTrucksStatistics() {
        getTruckStatisticsUseCase.getTrucksStatistics();
        verify(truckRepository).count();
    }
}
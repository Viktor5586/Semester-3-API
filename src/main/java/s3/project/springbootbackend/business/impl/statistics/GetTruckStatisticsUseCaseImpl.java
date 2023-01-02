package s3.project.springbootbackend.business.impl.statistics;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import s3.project.springbootbackend.business.useCases.statistics.GetTruckStatisticsUseCase;
import s3.project.springbootbackend.persistence.repositories.TruckRepository;

@Service
@AllArgsConstructor
public class GetTruckStatisticsUseCaseImpl implements GetTruckStatisticsUseCase {
    private TruckRepository truckRepository;
    @Override
    public long getTrucksStatistics() {
        return truckRepository.count();
    }
}

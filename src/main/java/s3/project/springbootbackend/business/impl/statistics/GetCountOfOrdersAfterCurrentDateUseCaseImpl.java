package s3.project.springbootbackend.business.impl.statistics;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import s3.project.springbootbackend.business.useCases.statistics.GetCountOfOrdersAfterCurrentDateUseCase;
import s3.project.springbootbackend.persistence.repositories.CargoRepository;
import java.util.Date;
@Service
@AllArgsConstructor
public class GetCountOfOrdersAfterCurrentDateUseCaseImpl implements GetCountOfOrdersAfterCurrentDateUseCase {
    CargoRepository cargoRepository;
    @Override
    public long getOrdersCount(Date date) {
        return cargoRepository.countAllByDateAfter(date);
    }
}

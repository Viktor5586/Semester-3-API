package s3.project.springbootbackend.business.impl.statistics;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import s3.project.springbootbackend.business.useCases.statistics.GetCountOfOrdersBeforeCurrentDateUseCase;
import s3.project.springbootbackend.persistence.repositories.CargoRepository;
import java.util.Date;

@Service
@AllArgsConstructor
public class GetCountOfOrdersBeforeCurrentDateUseCaseImpl implements GetCountOfOrdersBeforeCurrentDateUseCase {
    CargoRepository cargoRepository;
    @Override
    public long getOrdersCount(Date date) {
        return cargoRepository.countAllByDateBefore(date);
    }
}

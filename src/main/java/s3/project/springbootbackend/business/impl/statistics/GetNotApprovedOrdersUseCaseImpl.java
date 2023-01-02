package s3.project.springbootbackend.business.impl.statistics;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import s3.project.springbootbackend.business.useCases.statistics.GetNotApprovedOrdersUseCase;
import s3.project.springbootbackend.persistence.repositories.CargoRepository;
@Service
@AllArgsConstructor
public class GetNotApprovedOrdersUseCaseImpl implements GetNotApprovedOrdersUseCase {
    CargoRepository cargoRepository;
    @Override
    public long getAllNotApprovedOrdersCount(boolean notApproved) {
        return cargoRepository.countByApproved(notApproved);
    }
}

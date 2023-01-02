package s3.project.springbootbackend.business.impl.statistics;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import s3.project.springbootbackend.business.useCases.statistics.GetApprovedOrdersUseCase;
import s3.project.springbootbackend.persistence.repositories.CargoRepository;

@Service
@AllArgsConstructor
public class GetApprovedOrdersUseCaseImpl implements GetApprovedOrdersUseCase {
    private CargoRepository cargoRepository;
    @Override
    public long getAllApprovedOrders(boolean approved) {
        return cargoRepository.countByApproved(approved);
    }
}

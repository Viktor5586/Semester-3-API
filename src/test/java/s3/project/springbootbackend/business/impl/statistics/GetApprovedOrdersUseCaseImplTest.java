package s3.project.springbootbackend.business.impl.statistics;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import s3.project.springbootbackend.persistence.repositories.CargoRepository;

@ExtendWith(MockitoExtension.class)
class GetApprovedOrdersUseCaseImplTest {
    @Mock
    private CargoRepository cargoRepository;
    @InjectMocks
    GetApprovedOrdersUseCaseImpl getApprovedOrdersUseCase;

    @Test
    void getAllApprovedOrders_successful() {
        getApprovedOrdersUseCase.getAllApprovedOrders(true);
        Mockito.verify(cargoRepository).countByApproved(true);
    }
}
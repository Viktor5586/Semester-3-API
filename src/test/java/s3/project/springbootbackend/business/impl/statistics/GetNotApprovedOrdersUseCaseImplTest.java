package s3.project.springbootbackend.business.impl.statistics;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import s3.project.springbootbackend.persistence.repositories.CargoRepository;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class GetNotApprovedOrdersUseCaseImplTest {
    @Mock
    CargoRepository cargoRepository;
    @InjectMocks
    GetNotApprovedOrdersUseCaseImpl getNotApprovedOrdersUseCase;
    @Test
    void getAllNotApprovedOrdersCount_successful() {
        getNotApprovedOrdersUseCase.getAllNotApprovedOrdersCount(false);
        verify(cargoRepository).countByApproved(false);
    }
}
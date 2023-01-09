package s3.project.springbootbackend.business.impl.statistics;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import s3.project.springbootbackend.persistence.repositories.CargoRepository;

import java.util.Date;

import static org.mockito.Mockito.verify;
@ExtendWith(MockitoExtension.class)
class GetCountOfOrdersBeforeCurrentDateUseCaseImplTest {

    @Mock
    CargoRepository cargoRepository;
    @InjectMocks
    GetCountOfOrdersBeforeCurrentDateUseCaseImpl getCountOfOrdersBeforeCurrentDateUseCase;

    @Test
    void getOrdersCount_successful() {
        Date date = new Date();
        getCountOfOrdersBeforeCurrentDateUseCase.getOrdersCount(date);

        verify(cargoRepository).countAllByDateBefore(date);
    }
}
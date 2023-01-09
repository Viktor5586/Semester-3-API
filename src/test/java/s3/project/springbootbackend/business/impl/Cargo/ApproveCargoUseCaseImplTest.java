package s3.project.springbootbackend.business.impl.Cargo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import s3.project.springbootbackend.domain.Requests.Cargo.ApproveCargoRequest;
import s3.project.springbootbackend.persistence.Entities.CargoEntity;
import s3.project.springbootbackend.persistence.repositories.CargoRepository;

import java.util.Date;

import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
class ApproveCargoUseCaseImplTest {
    @InjectMocks
    private ApproveCargoUseCaseImpl approveCargoUseCase;
    @Mock
    private CargoRepository cargoRepository;

    @Test
    void approve_successful() {
        CargoEntity cargoEntity = CargoEntity.builder().id(1L).height(2).width(3).length(4).weight(5)
                .approved(false).customerId(6L).startPoint("Here").endPoint("There").date(new Date()).build();
        when(cargoRepository.findById(1L)).thenReturn(cargoEntity);
        ApproveCargoRequest request = ApproveCargoRequest.builder().id(cargoEntity.getId()).build();
        approveCargoUseCase.approve(request);
        verify(cargoRepository).approve(1L);
    }
}
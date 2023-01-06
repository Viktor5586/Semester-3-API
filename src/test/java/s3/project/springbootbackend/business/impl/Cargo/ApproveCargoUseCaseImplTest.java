package s3.project.springbootbackend.business.impl.Cargo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import s3.project.springbootbackend.persistence.repositories.CargoRepository;


@ExtendWith(MockitoExtension.class)
class ApproveCargoUseCaseImplTest {
    @InjectMocks
    private ApproveCargoUseCaseImpl approveCargoUseCase;
    @Mock
    private CargoRepository cargoRepository;

    @Test
    void approve_successful() {

//        CargoEntity cargoEntity = CargoEntity.builder().id(1L).height(2).width(3).length(4).weight(5)
//                .approved(false).customerId(6L).startPoint("Here").endPoint("There").date(new Date()).build();
////        ApproveCargoRequest request = ApproveCargoRequest.builder().id(1L).build();
//        when(cargoRepository.save(CargoEntity.builder().height(2).width(3).length(4).weight(5)
//                .approved(false).customerId(6L).startPoint("Here").endPoint("There").date(new Date()).build()))
//                .thenReturn(cargoEntity);
//        approveCargoUseCase.approve(ApproveCargoRequest.builder().id(cargoEntity.getId()).build());
//        verify(cargoRepository).approve(1L);
    }
}
package s3.project.springbootbackend.business.impl.Cargo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import s3.project.springbootbackend.domain.Responses.Cargo.GetAllCargosResponse;
import s3.project.springbootbackend.persistence.Entities.CargoEntity;
import s3.project.springbootbackend.persistence.repositories.CargoRepository;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
@ExtendWith(MockitoExtension.class)
class GetAllCargosUseCaseImplTest {
    @InjectMocks
    private GetAllCargosUseCaseImpl getAllCargosUseCase;
    @Mock
    private CargoRepository cargoRepository;

    @Test
    void getAllCargos_successful() {

        CargoEntity cargoEntity1 = CargoEntity.builder().id(1L).height(2).width(3).length(4).weight(5)
                .approved(false).customerId(6L).startPoint("Here").endPoint("There").date(new Date()).build();
        CargoEntity cargoEntity2 = CargoEntity.builder().id(2L).height(22).width(33).length(44).weight(55)
                .approved(false).customerId(66L).startPoint("Here").endPoint("There").date(new Date()).build();
        List<CargoEntity> cargoEntities = List.of(cargoEntity1, cargoEntity2);

        when(cargoRepository.findAll()).thenReturn(cargoEntities);
        GetAllCargosResponse actual = getAllCargosUseCase.getAllCargos();
        GetAllCargosResponse expexted = GetAllCargosResponse.builder().cargoAllEntities(List.of(cargoEntity1,cargoEntity2)).build();

        assertEquals(expexted, actual);
        verify(cargoRepository).findAll();
    }
}
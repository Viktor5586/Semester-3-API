package s3.project.springbootbackend.business.impl.Cargo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import s3.project.springbootbackend.domain.Requests.Cargo.CreateCargoRequest;
import s3.project.springbootbackend.domain.Responses.Cargo.CreateCargoResponse;
import s3.project.springbootbackend.persistence.Entities.CargoEntity;
import s3.project.springbootbackend.persistence.repositories.CargoRepository;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
@ExtendWith(MockitoExtension.class)
class CreateCargoUseCaseImpTest {
    @InjectMocks
    private CreateCargoUseCaseImp createCargoUseCaseImp;
    @Mock
    private CargoRepository repository;


    @Test
    void createCargo_successful() {
        CreateCargoRequest request = CreateCargoRequest.builder().height(2).width(3).length(4).weight(5)
                .customerId(6L).startPoint("Here").endPoint("There").date(new Date()).build();
        CargoEntity cargoEntity = CargoEntity.builder().id(1L).height(2).width(3).length(4).weight(5)
                .approved(false).customerId(6L).startPoint("Here").endPoint("There").date(new Date()).build();
        when(repository.save(CargoEntity.builder().height(2).width(3).length(4).weight(5)
                .approved(false).customerId(6L).startPoint("Here").endPoint("There").date(new Date()).build())).thenReturn(cargoEntity);
        CreateCargoResponse actual = createCargoUseCaseImp.createCargo(request);
        CreateCargoResponse expected = CreateCargoResponse.builder().id(1L).build();

        assertEquals(expected, actual);
        verify(repository).save(any());
    }

    @Test
    void add_successful() {
        CargoEntity cargoEntity = CargoEntity.builder().id(1L).height(2).width(3).length(4).weight(5)
                .approved(false).customerId(6L).startPoint("Here").endPoint("There").date(new Date()).build();
        repository.save(cargoEntity);

        Mockito.verify(repository,Mockito.times(1)).save(cargoEntity);
    }
}
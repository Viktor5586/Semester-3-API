package s3.project.springbootbackend.business.impl.Cargo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import s3.project.springbootbackend.domain.Requests.Cargo.DeleteCargoRequest;
import s3.project.springbootbackend.persistence.repositories.CargoRepository;

import static org.mockito.Mockito.*;
@ExtendWith(MockitoExtension.class)
class DeleteCargoUseCaseImplTest {
    @InjectMocks
    private DeleteCargoUseCaseImpl deleteCargoUseCase;
    @Mock
    private CargoRepository cargoRepository;

    @Test
    void delete_successful() {
        DeleteCargoRequest request = DeleteCargoRequest.builder().orderId(1).build();
        deleteCargoUseCase.delete(request);

        verify(cargoRepository).deleteById(request.getOrderId());
    }
}
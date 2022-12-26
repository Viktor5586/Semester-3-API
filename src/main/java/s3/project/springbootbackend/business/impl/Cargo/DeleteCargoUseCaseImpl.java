package s3.project.springbootbackend.business.impl.Cargo;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import s3.project.springbootbackend.business.useCases.Cargo.DeleteCargoUseCase;
import s3.project.springbootbackend.domain.Requests.DeleteCargoRequest;
import s3.project.springbootbackend.persistence.repositories.CargoRepository;

@Service
@AllArgsConstructor
public class DeleteCargoUseCaseImpl implements DeleteCargoUseCase {
    private CargoRepository cargoRepository;
    @Override
    public void delete(DeleteCargoRequest request) {
        cargoRepository.deleteById(request.getOrderId());
    }
}

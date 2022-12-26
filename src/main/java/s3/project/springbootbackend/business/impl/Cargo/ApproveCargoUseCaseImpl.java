package s3.project.springbootbackend.business.impl.Cargo;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import s3.project.springbootbackend.business.useCases.Cargo.ApproveCargoUseCase;
import s3.project.springbootbackend.domain.Requests.ApproveCargoRequest;
import s3.project.springbootbackend.persistence.Entities.CargoEntity;
import s3.project.springbootbackend.persistence.repositories.CargoRepository;

import java.util.Optional;

@Service
@AllArgsConstructor
public class ApproveCargoUseCaseImpl implements ApproveCargoUseCase {
    private CargoRepository cargoRepository;

    @Override
    public void approve(ApproveCargoRequest request) {
        try {
            CargoEntity cargo = cargoRepository.findById(request.getId());
            if (cargo.isApproved() == false) {
                cargoRepository.approve(request.getId());
            } else {
                throw new RuntimeException("Should be custom exception"); //Should be custom exception
            }
        }catch (Exception exception){
            throw new RuntimeException("Something went wrong!");
        }

    }
}

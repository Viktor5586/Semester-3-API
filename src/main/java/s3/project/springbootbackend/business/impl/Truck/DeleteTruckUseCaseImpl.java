package s3.project.springbootbackend.business.impl.Truck;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import s3.project.springbootbackend.business.useCases.Truck.DeleteTruckUseCase;
import s3.project.springbootbackend.domain.Requests.DeleteTruckRequest;
import s3.project.springbootbackend.persistence.repositories.TruckRepository;

@Service
@AllArgsConstructor
public class DeleteTruckUseCaseImpl implements DeleteTruckUseCase {
    private TruckRepository truckRepository;
    @Override
    public void delete(DeleteTruckRequest request) {
        truckRepository.deleteById(request.getTruckId());
    }
}

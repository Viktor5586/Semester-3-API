package s3.project.springbootbackend.business.impl.Truck;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import s3.project.springbootbackend.business.useCases.Truck.CreateTruckUseCase;
import s3.project.springbootbackend.business.validations.ValidateTruck;
import s3.project.springbootbackend.domain.Requests.Truck.CreateTruckRequest;
import s3.project.springbootbackend.domain.Responses.Truck.CreateTruckResponse;
import s3.project.springbootbackend.persistence.Entities.TruckEntity;
import s3.project.springbootbackend.persistence.repositories.TruckRepository;

@Service
@AllArgsConstructor
public class CreateTruckUseCaseImpl implements CreateTruckUseCase {

    private TruckRepository truckRepository;

    @Override
    public CreateTruckResponse createTruck(CreateTruckRequest request) {
//        try{
            TruckEntity savedTruck = add(request);
            return CreateTruckResponse.builder()
                    .id(savedTruck.getId())
                    .build();
//        }catch (Exception exception){
//            throw (exception);
//        }

    }

    private TruckEntity add(CreateTruckRequest request) {
        ValidateTruck.validate(request);
            TruckEntity newTruck = TruckEntity.builder()
                    .licencePlate(request.getLicencePlate())
                    .location(request.getLocation())
                    .height(request.getHeight())
                    .width(request.getWidth())
                    .length(request.getLength())
                    .maxWeight(request.getMaxWeight())
                    .tankVolume(request.getTankVolume())
                    .fuelConsumptionPerKm(request.getFuelConsumptionPerKm())
                    .build();
            return truckRepository.save(newTruck);
    }
}

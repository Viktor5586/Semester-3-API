package s3.project.springbootbackend.business.impl.Truck;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import s3.project.springbootbackend.business.impl.Converters.FromQueryToEntity;
import s3.project.springbootbackend.business.useCases.Truck.GetTrucksByAnyParameterUseCase;
import s3.project.springbootbackend.domain.Requests.GetTrucksByAnyParameterRequest;
import s3.project.springbootbackend.domain.Responses.GetAllTrucksResponse;
import s3.project.springbootbackend.persistence.Entities.TruckEntity;
import s3.project.springbootbackend.persistence.repositories.TruckRepository;

import java.util.ArrayList;
import java.util.List;
@Service
@AllArgsConstructor
public class GetTrucksByAnyParameterUseCaseImpl implements GetTrucksByAnyParameterUseCase {
    private TruckRepository truckRepository;

    @Override
    public GetAllTrucksResponse getTrucksByAnyParameterUseCase(GetTrucksByAnyParameterRequest request) {
        List<Object[]> trucks;
        trucks = truckRepository.getTruckEntitiesByIdAndLocationAAndHeightAndLengthAndWidthAndMaxWeightAndTankVolumeAndFuelConsumptionPerKm(request.getId(), request.getLicencePlate(), request.getLocation(), request.getHeight(), request.getLength(), request.getWidth(), request.getMaxWeight(), request.getTankVolume(), request.getFuelConsumptionPerKm());

//        List<TruckEntity> truckEntities = truckRepository.getTruckEntitiesByIdAndLocationAAndHeightAndLengthAndWidthAndMaxWeightAndTankVolumeAndFuelConsumptionPerKm(request.getId(), request.getLicencePlate(), request.getLocation(), request.getHeight(), request.getLength(), request.getWidth(), request.getMaxWeight(), request.getTankVolume(), request.getFuelConsumptionPerKm());
        GetAllTrucksResponse response = new GetAllTrucksResponse();
        List<TruckEntity> truckEntities = trucks.stream().map(FromQueryToEntity::convert).toList();

        response.setAllTruckEntities(truckEntities);

        return response;
    }
}

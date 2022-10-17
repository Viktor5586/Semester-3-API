package s3.project.springbootbackend.business.impl.Truck;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import s3.project.springbootbackend.business.impl.Converters.TruckConverter;
import s3.project.springbootbackend.business.useCases.Truck.GetAllTrucksUseCase;
import s3.project.springbootbackend.domain.Responses.GetAllTrucksResponse;
import s3.project.springbootbackend.domain.Entities.Truck;
import s3.project.springbootbackend.persistence.Entities_DTO.TruckEntity;
import s3.project.springbootbackend.persistence.repositories.TruckRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class GetAllTrucksUseCaseImpl implements GetAllTrucksUseCase {
    private TruckRepository truckRepository;
    @Override
    public GetAllTrucksResponse getAllTrucks() {
        List<TruckEntity> truckEntities = truckRepository.allTrucks();
        GetAllTrucksResponse response = new GetAllTrucksResponse();
        List<Truck> trucks = truckEntities
                .stream()
                .map(TruckConverter::convert)
                .toList();
        response.setAllTruckEntities(truckEntities);
        return response;
    }
}

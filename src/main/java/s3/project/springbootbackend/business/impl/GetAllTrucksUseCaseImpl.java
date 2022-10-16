package s3.project.springbootbackend.business.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import s3.project.springbootbackend.business.GetAllTrucksUseCase;
import s3.project.springbootbackend.domain.GetAllTrucksResponse;
import s3.project.springbootbackend.domain.Truck;
import s3.project.springbootbackend.persistence.Entities.TruckEntity;
import s3.project.springbootbackend.persistence.TruckRepository;

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

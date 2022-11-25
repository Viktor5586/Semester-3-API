package s3.project.springbootbackend.business.impl.Truck;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import s3.project.springbootbackend.business.impl.Converters.TruckConverter;
import s3.project.springbootbackend.business.useCases.Truck.GetTruckByLocationUseCase;
import s3.project.springbootbackend.domain.Entities.Truck;
import s3.project.springbootbackend.domain.Requests.GetAllTrucksPerLocationRequest;
import s3.project.springbootbackend.domain.Responses.GetAllTrucksResponse;
import s3.project.springbootbackend.persistence.Entities.TruckEntity;
import s3.project.springbootbackend.persistence.repositories.TruckRepository;

import java.util.List;

@Service
@NoArgsConstructor
@AllArgsConstructor
//@NoArgsConstructor
public class GetTruckByLocationUseCaseImpl implements GetTruckByLocationUseCase {
    private TruckRepository truckRepository;
    @Override
    public GetAllTrucksResponse getTruckByLocation(GetAllTrucksPerLocationRequest request) {
        List<TruckEntity> truckEntities = truckRepository.getAllByLocation(request.getLocation());
        GetAllTrucksResponse response = new GetAllTrucksResponse();
        List<Truck> trucks = truckEntities
                .stream()
                //.filter(t -> t.equals(request.getLocation()))
                .map(TruckConverter::convert)
                .toList();
        response.setAllTruckEntities(truckEntities);
        return response;
    }
}

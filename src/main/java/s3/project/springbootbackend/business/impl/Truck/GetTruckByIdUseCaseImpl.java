package s3.project.springbootbackend.business.impl.Truck;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import s3.project.springbootbackend.business.useCases.Truck.GetTruckByIdUseCase;
import s3.project.springbootbackend.domain.Requests.GetTruckByIdRequest;
import s3.project.springbootbackend.domain.Responses.GetAllTrucksResponse;
import s3.project.springbootbackend.persistence.Entities.TruckEntity;
import s3.project.springbootbackend.persistence.repositories.TruckRepository;


import java.util.Optional;

@Service
@AllArgsConstructor
public class GetTruckByIdUseCaseImpl implements GetTruckByIdUseCase {

    private TruckRepository truckRepository;


    @Override
    public GetAllTrucksResponse getTruckById(GetTruckByIdRequest request) {
        Optional<TruckEntity> truckEntity = truckRepository.findById(request.getId());
        GetAllTrucksResponse response = new GetAllTrucksResponse();
        response.setAllTruckEntities(truckEntity.stream().toList());
        return response;
    }
}

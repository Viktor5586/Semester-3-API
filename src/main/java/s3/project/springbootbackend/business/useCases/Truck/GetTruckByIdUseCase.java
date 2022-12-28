package s3.project.springbootbackend.business.useCases.Truck;

import s3.project.springbootbackend.domain.Requests.Truck.GetTruckByIdRequest;
import s3.project.springbootbackend.domain.Responses.Truck.GetAllTrucksResponse;

public interface GetTruckByIdUseCase {
    public GetAllTrucksResponse getTruckById(GetTruckByIdRequest request);
}

package s3.project.springbootbackend.business.useCases.Truck;

import s3.project.springbootbackend.domain.Requests.GetAllTrucksPerLocationRequest;
import s3.project.springbootbackend.domain.Requests.GetTruckByIdRequest;
import s3.project.springbootbackend.domain.Responses.GetAllTrucksResponse;

public interface GetTruckByIdUseCase {
    public GetAllTrucksResponse getTruckById(GetTruckByIdRequest request);
}

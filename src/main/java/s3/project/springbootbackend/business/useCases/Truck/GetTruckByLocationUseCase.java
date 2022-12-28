package s3.project.springbootbackend.business.useCases.Truck;

import s3.project.springbootbackend.domain.Requests.Truck.GetAllTrucksPerLocationRequest;
import s3.project.springbootbackend.domain.Responses.Truck.GetAllTrucksResponse;

public interface GetTruckByLocationUseCase {

    public GetAllTrucksResponse getTruckByLocation(GetAllTrucksPerLocationRequest request);
}

package s3.project.springbootbackend.business.useCases.Truck;

import s3.project.springbootbackend.domain.Requests.GetAllTrucksPerLocationRequest;
import s3.project.springbootbackend.domain.Responses.GetAllTrucksResponse;

public interface GetTruckByLocationUseCase {

    public GetAllTrucksResponse getTruckByLocation(GetAllTrucksPerLocationRequest request);
}

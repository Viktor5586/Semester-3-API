package s3.project.springbootbackend.business.useCases.Truck;

import s3.project.springbootbackend.domain.Requests.Truck.GetTrucksByAnyParameterRequest;
import s3.project.springbootbackend.domain.Responses.Truck.GetAllTrucksResponse;

public interface GetTrucksByAnyParameterUseCase {
    GetAllTrucksResponse getTrucksByAnyParameterUseCase(GetTrucksByAnyParameterRequest request);
}

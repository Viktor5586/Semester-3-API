package s3.project.springbootbackend.business.useCases.Truck;

import s3.project.springbootbackend.domain.Requests.GetTrucksByAnyParameterRequest;
import s3.project.springbootbackend.domain.Responses.GetAllTrucksResponse;

import java.util.List;

public interface GetTrucksByAnyParameterUseCase {
    GetAllTrucksResponse getTrucksByAnyParameterUseCase(GetTrucksByAnyParameterRequest request);
}

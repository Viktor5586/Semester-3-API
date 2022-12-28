package s3.project.springbootbackend.business.useCases.Truck;

import s3.project.springbootbackend.domain.Responses.Truck.GetAllTrucksResponse;

public interface GetAllTrucksUseCase {
    public GetAllTrucksResponse getAllTrucks();
}

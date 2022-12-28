package s3.project.springbootbackend.business.useCases.Truck;


import s3.project.springbootbackend.domain.Requests.Truck.CreateTruckRequest;
import s3.project.springbootbackend.domain.Responses.Truck.CreateTruckResponse;

public interface CreateTruckUseCase {
    CreateTruckResponse createTruck(CreateTruckRequest request);
}

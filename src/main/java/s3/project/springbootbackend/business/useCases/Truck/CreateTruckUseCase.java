package s3.project.springbootbackend.business.useCases.Truck;


import s3.project.springbootbackend.domain.Requests.CreateTruckRequest;
import s3.project.springbootbackend.domain.Responses.CreateTruckResponse;

public interface CreateTruckUseCase {
    public CreateTruckResponse createTruck(CreateTruckRequest request);
}

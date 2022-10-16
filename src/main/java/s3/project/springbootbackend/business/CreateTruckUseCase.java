package s3.project.springbootbackend.business;


import s3.project.springbootbackend.domain.CreateTruckRequest;
import s3.project.springbootbackend.domain.CreateTruckResponse;

public interface CreateTruckUseCase {
    public CreateTruckResponse createTruck(CreateTruckRequest request);
}

package s3.project.springbootbackend.business.useCases.Truck;

import s3.project.springbootbackend.domain.Requests.DeleteTruckRequest;

public interface DeleteTruckUseCase {
    void delete(DeleteTruckRequest request);
}

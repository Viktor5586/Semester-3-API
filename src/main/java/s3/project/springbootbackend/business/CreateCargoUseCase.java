package s3.project.springbootbackend.business;

import s3.project.springbootbackend.domain.CreateCargoRequest;
import s3.project.springbootbackend.domain.CreateCargoResponse;

public interface CreateCargoUseCase {
    public CreateCargoResponse createCargo(CreateCargoRequest request);
}

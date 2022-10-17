package s3.project.springbootbackend.business.useCases.Cargo;

import s3.project.springbootbackend.domain.Requests.CreateCargoRequest;
import s3.project.springbootbackend.domain.Responses.CreateCargoResponse;

public interface CreateCargoUseCase {
    public CreateCargoResponse createCargo(CreateCargoRequest request);
}

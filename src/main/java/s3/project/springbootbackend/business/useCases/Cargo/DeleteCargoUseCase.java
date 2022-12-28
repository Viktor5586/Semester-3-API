package s3.project.springbootbackend.business.useCases.Cargo;

import s3.project.springbootbackend.domain.Requests.Cargo.DeleteCargoRequest;

public interface DeleteCargoUseCase {
    public void delete(DeleteCargoRequest request);
}

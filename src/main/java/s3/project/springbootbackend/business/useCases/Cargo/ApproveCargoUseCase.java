package s3.project.springbootbackend.business.useCases.Cargo;

import s3.project.springbootbackend.domain.Requests.Cargo.ApproveCargoRequest;

public interface ApproveCargoUseCase {
    void approve(ApproveCargoRequest request);
}

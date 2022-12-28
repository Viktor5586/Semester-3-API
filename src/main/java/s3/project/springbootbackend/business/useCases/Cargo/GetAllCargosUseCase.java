package s3.project.springbootbackend.business.useCases.Cargo;

import s3.project.springbootbackend.domain.Responses.Cargo.GetAllCargosResponse;

public interface GetAllCargosUseCase {
    GetAllCargosResponse getAllCargos();
}

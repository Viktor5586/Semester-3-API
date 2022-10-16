package s3.project.springbootbackend.business.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import s3.project.springbootbackend.business.GetAllCargosUseCase;
import s3.project.springbootbackend.domain.Cargo;
import s3.project.springbootbackend.domain.GetAllCargosResponse;
import s3.project.springbootbackend.persistence.CargoRepository;
import s3.project.springbootbackend.persistence.Entities.CargoEntity;

import java.util.List;

@Service
@AllArgsConstructor
public class GetAllCargosUseCaseImpl implements GetAllCargosUseCase {
    private CargoRepository cargoRepository;
    @Override
    public GetAllCargosResponse getAllCargos() {
        List<CargoEntity> cargoEntities = cargoRepository.allCargos();
        GetAllCargosResponse response = new GetAllCargosResponse();
        List<Cargo> cargos = cargoEntities
                .stream()
                .map(CargoConverter::convert)
                .toList();
        response.setCargoAllEntities(cargoEntities);
        return response;
    }
}

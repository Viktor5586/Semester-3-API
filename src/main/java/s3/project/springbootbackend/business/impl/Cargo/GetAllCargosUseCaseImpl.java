package s3.project.springbootbackend.business.impl.Cargo;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import s3.project.springbootbackend.business.impl.Converters.CargoConverter;
import s3.project.springbootbackend.business.useCases.Cargo.GetAllCargosUseCase;
import s3.project.springbootbackend.domain.Entities.Cargo;
import s3.project.springbootbackend.domain.Responses.GetAllCargosResponse;
import s3.project.springbootbackend.persistence.repositories.CargoRepository;
import s3.project.springbootbackend.persistence.Entities_DTO.CargoEntity;

import java.util.List;

@Service
@AllArgsConstructor
public class GetAllCargosUseCaseImpl implements GetAllCargosUseCase {
    private CargoRepository cargoRepository;
    @Override
    public GetAllCargosResponse getAllCargos() {
        List<CargoEntity> cargoEntities = cargoRepository.findAll();
        GetAllCargosResponse response = new GetAllCargosResponse();
        List<Cargo> cargos = cargoEntities
                .stream()
                .map(CargoConverter::convert)
                .toList();
        response.setCargoAllEntities(cargoEntities);
        return response;
    }
}

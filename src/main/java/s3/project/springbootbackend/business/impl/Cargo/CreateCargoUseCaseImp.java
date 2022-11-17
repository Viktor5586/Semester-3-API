package s3.project.springbootbackend.business.impl.Cargo;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import s3.project.springbootbackend.business.useCases.Cargo.CreateCargoUseCase;
import s3.project.springbootbackend.domain.Requests.CreateCargoRequest;
import s3.project.springbootbackend.domain.Responses.CreateCargoResponse;
import s3.project.springbootbackend.persistence.repositories.CargoRepository;
import s3.project.springbootbackend.persistence.Entities_DTO.CargoEntity;

@Service
@AllArgsConstructor
public class CreateCargoUseCaseImp implements CreateCargoUseCase {
    private CargoRepository repository;
    @Override
    public CreateCargoResponse createCargo(CreateCargoRequest request) {
        CargoEntity savedCargo = add(request);
        return CreateCargoResponse.builder()
                .id(savedCargo.getId())
                .build();
    }

    public CargoEntity add(CreateCargoRequest request){
        CargoEntity cargoEntity = CargoEntity.builder()
                .length(request.getLength())
                .width(request.getWidth())
                .height(request.getHeight())
                .weight(request.getWeight())
                .startPoint(request.getStartPoint())
                .endPoint(request.getEndPoint())
                .date(request.getDate())
                .build();

        return repository.save(cargoEntity);
    }
}

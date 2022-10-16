package s3.project.springbootbackend.business.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import s3.project.springbootbackend.business.CreateCargoUseCase;
import s3.project.springbootbackend.domain.CreateCargoRequest;
import s3.project.springbootbackend.domain.CreateCargoResponse;
import s3.project.springbootbackend.persistence.CargoRepository;
import s3.project.springbootbackend.persistence.Entities.CargoEntity;

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
                .build();

        return repository.create(cargoEntity);
    }
}

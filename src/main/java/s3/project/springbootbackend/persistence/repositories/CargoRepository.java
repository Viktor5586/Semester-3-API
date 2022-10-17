package s3.project.springbootbackend.persistence.repositories;

import s3.project.springbootbackend.persistence.Entities_DTO.CargoEntity;

import java.util.List;
import java.util.Optional;

public interface CargoRepository {
    CargoEntity create(CargoEntity cargo);
    CargoEntity update(CargoEntity cargo);
    List<CargoEntity> allCargos();
    List<CargoEntity> allCargosPerUser(long id);
    Optional<CargoEntity> fingBySize(double height, double width, double length);
    Optional<CargoEntity> findById(long id);

}

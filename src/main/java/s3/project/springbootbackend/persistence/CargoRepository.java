package s3.project.springbootbackend.persistence;

import org.springframework.stereotype.Repository;
import s3.project.springbootbackend.persistence.Entities.CargoEntity;
import s3.project.springbootbackend.persistence.Entities.TruckEntity;

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

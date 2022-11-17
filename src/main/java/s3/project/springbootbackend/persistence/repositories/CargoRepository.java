package s3.project.springbootbackend.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import s3.project.springbootbackend.persistence.Entities_DTO.CargoEntity;
import s3.project.springbootbackend.persistence.Entities_DTO.CustomerEntity;

import java.util.List;
import java.util.Optional;


public interface CargoRepository extends JpaRepository<CargoEntity, Long> {
    /*CargoEntity create(CargoEntity cargo);
    CargoEntity update(CargoEntity cargo);
    List<CargoEntity> allCargos();
    List<CargoEntity> allCargosPerUser(long id);
    Optional<CargoEntity> fingBySize(double height, double width, double length);
    Optional<CargoEntity> findById(long id);*/

}

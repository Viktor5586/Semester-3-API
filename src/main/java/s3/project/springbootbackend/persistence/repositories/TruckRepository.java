package s3.project.springbootbackend.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import s3.project.springbootbackend.persistence.Entities_DTO.TruckEntity;

import java.util.List;
import java.util.Optional;

//@Repository
public interface TruckRepository extends JpaRepository<TruckEntity, Long> {
    void removeByLicencePlate(String licencePlate);
    List<TruckEntity> getAllByLocation(String location);
    Optional<TruckEntity> getByLicencePlate(String licencePlate);
}

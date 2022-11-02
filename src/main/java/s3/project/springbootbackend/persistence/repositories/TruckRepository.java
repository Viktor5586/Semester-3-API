package s3.project.springbootbackend.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import s3.project.springbootbackend.persistence.Entities_DTO.TruckEntity;

import java.util.List;
import java.util.Optional;

@Repository
public interface TruckRepository extends JpaRepository<TruckEntity, Long> {
    void removeById(long truckId);
    List<TruckEntity> getAllByLocation(String location);
    Optional<TruckEntity> getByLicencePlate(String licencePlate);
    Optional<TruckEntity> getById(long id);
}

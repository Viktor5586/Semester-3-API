package s3.project.springbootbackend.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import s3.project.springbootbackend.persistence.Entities_DTO.TruckEntity;

import java.util.List;
import java.util.Optional;

public interface TruckRepository extends JpaRepository<TruckEntity, Long> {
    //TruckEntity save(TruckEntity truck);
    void deleteById(long truckId);
    List<TruckEntity> allTrucks();
    List<TruckEntity> findAllByLocation(String location);
    Optional<TruckEntity> findById(long id);
}

package s3.project.springbootbackend.persistence.repositories;

import s3.project.springbootbackend.persistence.Entities_DTO.TruckEntity;

import java.util.List;
import java.util.Optional;

public interface TruckRepository {
    TruckEntity save(TruckEntity truck);
    void deleteById(long truckId);
    List<TruckEntity> allTrucks();
    List<TruckEntity> allTrucksCloseToLocation(String location);
    Optional<TruckEntity> findById(long id);
}

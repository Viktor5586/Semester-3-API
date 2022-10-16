package s3.project.springbootbackend.persistence;

import s3.project.springbootbackend.persistence.Entities.TruckEntity;

import java.util.List;
import java.util.Optional;

public interface TruckRepository {
    TruckEntity save(TruckEntity truck);
    void deleteById(long truckId);
    List<TruckEntity> allTrucks();
    List<TruckEntity> allTrucksCloseToLocation(String location);
    Optional<TruckEntity> findById(long id);
}

package s3.project.springbootbackend.persistence.impl;

import org.springframework.stereotype.Repository;
import s3.project.springbootbackend.persistence.Entities_DTO.TruckEntity;
import s3.project.springbootbackend.persistence.repositories.TruckRepository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Repository
public class TruckRepositoryImpl{
    private static long NEXT_ID = 1;
    private final List<TruckEntity> savedTrucks;

    public TruckRepositoryImpl() {
        this.savedTrucks = new ArrayList<>();
    }

    //@Override
    public void deleteById(long truckId) {
        this.savedTrucks.removeIf(truckEntity -> truckEntity.getId().equals(truckId));
    }

    //@Override
    public List<TruckEntity> allTrucks() {
        return Collections.unmodifiableList(this.savedTrucks);
    }

    //@Override //later will be implemented
    public List<TruckEntity> allTrucksCloseToLocation(String location) {
        return null;
    }

    //@Override
    public Optional<TruckEntity> findById(long id) {
        return this.savedTrucks.stream()
                .filter(truckEntity -> truckEntity.getId().equals(id))
                .findFirst();
    }


}

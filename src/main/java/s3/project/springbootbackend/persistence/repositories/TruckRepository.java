package s3.project.springbootbackend.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import s3.project.springbootbackend.persistence.Entities.TruckEntity;

import java.util.List;

public interface TruckRepository extends JpaRepository<TruckEntity, Long> {
    List<TruckEntity> getAllByLocation(String location);
    @Query("select tr.id, tr.licencePlate, tr.location, tr.height, tr.length, tr.width, tr.maxWeight, tr.tankVolume, tr.fuelConsumptionPerKm from TruckEntity as tr " +
            "where (:id is null or tr.id = :id)" +
            "and (:licencePlate is null or tr.licencePlate = :licencePlate)" +
            "and (:location is null or tr.location = :location)" +
            "and (:height is null or tr.height=:height)" +
            "and (:length is null or tr.length=:length)" +
            "and (:width is null or tr.width=:width)" +
            "and (:maxWeight is null or tr.maxWeight=:maxWeight)" +
            "and (:tankVolume is null or tr.tankVolume=:tankVolume)" +
            "and (:fuelConsumptionPerKm is null or tr.fuelConsumptionPerKm=:fuelConsumptionPerKm)")
    List<Object[]> getTruckEntitiesByIdAndLocationAAndHeightAndLengthAndWidthAndMaxWeightAndTankVolumeAndFuelConsumptionPerKm(@Param("id") Long id,
                                              @Param("licencePlate")String licencePlate,
                                              @Param("location")String location,
                                              @Param("height")Double height,
                                              @Param("length")Double length,
                                              @Param("width")Double width,
                                              @Param("maxWeight")Double maxWeight,
                                              @Param("tankVolume")Double tankVolume,
                                              @Param("fuelConsumptionPerKm")Double fuelConsumptionPerKm);
    }

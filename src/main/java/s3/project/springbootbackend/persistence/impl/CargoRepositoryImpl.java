package s3.project.springbootbackend.persistence.impl;

import org.springframework.stereotype.Repository;
import s3.project.springbootbackend.persistence.repositories.CargoRepository;
import s3.project.springbootbackend.persistence.Entities_DTO.CargoEntity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Repository
public class CargoRepositoryImpl implements CargoRepository {
    private static long NEXT_ID = 1;
    private final List<CargoEntity> savedCargos;

    public CargoRepositoryImpl() {
        this.savedCargos = new ArrayList<>();
    }

    @Override
    public CargoEntity create(CargoEntity cargo) {
        if(cargo.getId() == null){
            cargo.setId(NEXT_ID);
            NEXT_ID++;
            this.savedCargos.add(cargo);
        }
        return cargo;
    }

    //have to check how to update
    @Override
    public CargoEntity update(CargoEntity cargo) {
        if(cargo.getId() != null){

        }
        return null;
    }

    @Override
    public List<CargoEntity> allCargos() {
        return Collections.unmodifiableList(savedCargos);
    }
    //have to check
    @Override
    public List<CargoEntity> allCargosPerUser(long id) {
        return null;
    }
    //have to check
    @Override
    public Optional<CargoEntity> fingBySize(double height, double width, double length) {
        return Optional.empty();
    }

    @Override
    public Optional<CargoEntity> findById(long id) {
        return this.savedCargos.stream()
                .filter(cargoEntity -> cargoEntity.getId().equals(id))
                .findFirst();
    }
}

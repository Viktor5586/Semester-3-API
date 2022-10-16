package s3.project.springbootbackend.configuration;

import lombok.AllArgsConstructor;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import s3.project.springbootbackend.domain.Truck;
import s3.project.springbootbackend.persistence.CargoRepository;
import s3.project.springbootbackend.persistence.Entities.CargoEntity;
import s3.project.springbootbackend.persistence.Entities.TruckEntity;
import s3.project.springbootbackend.persistence.Entities.UserEntity;
import s3.project.springbootbackend.persistence.TruckRepository;
import s3.project.springbootbackend.persistence.UserRepository;

@Component
@AllArgsConstructor
public class DumyDataInitializer {
    private UserRepository userRepository;
    private TruckRepository truckRepository;
    private CargoRepository cargoRepository;

    @EventListener(ApplicationReadyEvent.class)
    public void initialUserDummyData(){
        if (userRepository.findAll().size() == 0){
            userRepository.save(UserEntity.builder().username("Gepi").password("asdfghjk").build());
            userRepository.save(UserEntity.builder().username("Gogi").password("asdfghjk").build());
            userRepository.save(UserEntity.builder().username("Ko").password("asdfghjk").build());
            userRepository.save(UserEntity.builder().username("Ne").password("asdfghjk").build());
        }
    }

    @EventListener(ApplicationReadyEvent.class)
    public void initialTruckDummyData(){
        if (truckRepository.allTrucks().size() == 0){
            truckRepository.save(TruckEntity.builder().licencePlate("AAAA").location("Amsterdam").height(2).width(3).length(4)
                            .maxWeight(5).tankVolume(6).fuelConsumptionPerKm(7).build());
            truckRepository.save(TruckEntity.builder().licencePlate("BBBB").location("Eindhoven").height(2).width(3).length(4)
                    .maxWeight(5).tankVolume(6).fuelConsumptionPerKm(7).build());
            truckRepository.save(TruckEntity.builder().licencePlate("CCCC").location("Utrecht").height(2).width(3).length(4)
                    .maxWeight(5).tankVolume(6).fuelConsumptionPerKm(7).build());
            truckRepository.save(TruckEntity.builder().licencePlate("DDDD").location("Venlo").height(2).width(3).length(4)
                    .maxWeight(5).tankVolume(6).fuelConsumptionPerKm(7).build());
            truckRepository.save(TruckEntity.builder().licencePlate("EEEE").location("Rotterdam").height(2).width(3).length(4)
                    .maxWeight(5).tankVolume(6).fuelConsumptionPerKm(7).build());
        }
    }

    @EventListener(ApplicationReadyEvent.class)
    public void initialCargoDummyData(){
        if (cargoRepository.allCargos().size() == 0){
            cargoRepository.create(CargoEntity.builder().height(1).width(2).length(3).weight(4).build());
            cargoRepository.create(CargoEntity.builder().height(2).width(3).length(4).weight(5).build());
            cargoRepository.create(CargoEntity.builder().height(3).width(4).length(5).weight(6).build());
            cargoRepository.create(CargoEntity.builder().height(4).width(5).length(6).weight(7).build());
        }
    }


}

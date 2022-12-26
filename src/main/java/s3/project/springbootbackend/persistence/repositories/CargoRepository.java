package s3.project.springbootbackend.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import s3.project.springbootbackend.persistence.Entities.CargoEntity;

import javax.transaction.Transactional;

@Repository
public interface CargoRepository extends JpaRepository<CargoEntity, Long> {
    /*CargoEntity create(CargoEntity cargo);
    CargoEntity update(CargoEntity cargo);
    List<CargoEntity> allCargos();
    List<CargoEntity> allCargosPerUser(long id);
    Optional<CargoEntity> fingBySize(double height, double width, double length);
    Optional<CargoEntity> findById(long id);*/
    @Modifying
    @Transactional
    @Query("update CargoEntity set approved=true where id=:id")
    void approve(@Param("id") long id);
    CargoEntity findById(long id);
    void  deleteAllByCustomerId(long customerId);

}

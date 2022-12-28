package s3.project.springbootbackend.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import s3.project.springbootbackend.persistence.Entities.CargoEntity;

import javax.transaction.Transactional;
import java.util.Date;

@Repository
public interface CargoRepository extends JpaRepository<CargoEntity, Long> {
    @Modifying
    @Transactional
    @Query("update CargoEntity set approved=true where id=:id")
    void approve(@Param("id") long id);
    CargoEntity findById(long id);
    void  deleteAllByCustomerId(long customerId);
    int countByApproved(boolean approved);
//    int countAllByApprovedNot();
    int countAllByDateBefore(Date currentDate);
    int countAllByDate(Date currentDate);
    int countAllByDateAfter(Date date);

}

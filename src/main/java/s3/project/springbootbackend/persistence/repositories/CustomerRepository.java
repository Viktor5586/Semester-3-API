package s3.project.springbootbackend.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import s3.project.springbootbackend.persistence.Entities.CustomerEntity;

import javax.transaction.Transactional;


public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {
@Modifying
@Transactional
@Query(" update CustomerEntity as c set c.firstName = :firstName , c.lastName = :lastName where c.id = :id")
    void update(@Param("firstName")String firstName,@Param("lastName")String lastName,@Param("id")Long id);
}

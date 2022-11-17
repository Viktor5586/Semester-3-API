package s3.project.springbootbackend.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import s3.project.springbootbackend.persistence.Entities_DTO.CustomerEntity;
import s3.project.springbootbackend.persistence.Entities_DTO.EmployeeEntity;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {


    //CustomerEntity save(CustomerEntity user);

    //void deleteById(long userId);

    //List<CustomerEntity> findAll();
    //Optional<CustomerEntity> findById(long id);

}

package s3.project.springbootbackend.persistence.repositories;

import s3.project.springbootbackend.persistence.Entities_DTO.CustomerEntity;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository {


    CustomerEntity save(CustomerEntity user);

    void deleteById(long userId);

    List<CustomerEntity> findAll();
    Optional<CustomerEntity> findById(long id);

}

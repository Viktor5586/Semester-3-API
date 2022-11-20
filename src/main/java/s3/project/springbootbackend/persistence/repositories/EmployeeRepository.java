package s3.project.springbootbackend.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import s3.project.springbootbackend.persistence.Entities.EmployeeEntity;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
    Optional<EmployeeEntity> getEmployeeEntitiesByFirstNameOrLastName(Optional<String> firstName, Optional<String> lastName);
}

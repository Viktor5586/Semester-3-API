package s3.project.springbootbackend.persistence.Entities;

import lombok.Getter;
import lombok.Setter;

//@Builder
@Getter
@Setter
public class EmployeeEntity extends UserEntity {
    private Integer salary;

    EmployeeEntity(Long id, String username, String password) {
        super(id, username, password);
    }
}

package s3.project.springbootbackend.persistence.Entities_DTO;

//@Builder
//@Getter
//@Setter
public class EmployeeEntity extends UserEntity {
    private Integer salary;

    EmployeeEntity(Long id, String username, String password) {
        super(id, username, password);
    }
}

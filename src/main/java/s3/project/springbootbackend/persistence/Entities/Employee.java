package s3.project.springbootbackend.persistence.Entities;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Employee extends User {
    private Integer salary;
}

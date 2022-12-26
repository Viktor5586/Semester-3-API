package s3.project.springbootbackend.domain.Entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import s3.project.springbootbackend.configuration.Generated;

@Data
@Builder
@AllArgsConstructor
@Generated
public class Employee {

    private final Long id;
    private final String firstName;
    private final String lastName;
    //private final String username;
    //private final String password;


}

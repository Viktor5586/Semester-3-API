package s3.project.springbootbackend.domain.Entities;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
public class Customer {
    private final Long id;
    private final String firstName;
    private final String lastName;
    //private final String username;
    //private final String password;

}

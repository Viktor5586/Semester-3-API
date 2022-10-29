package s3.project.springbootbackend.persistence.Entities_DTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CustomerEntity {
    private Long id;
    private String username;
    private String password;

}

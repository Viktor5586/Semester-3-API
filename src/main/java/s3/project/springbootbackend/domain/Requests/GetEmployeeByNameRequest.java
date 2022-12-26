package s3.project.springbootbackend.domain.Requests;

import lombok.Builder;
import lombok.Data;
import s3.project.springbootbackend.configuration.Generated;

import java.util.Optional;

@Data
@Builder
@Generated
public class GetEmployeeByNameRequest {
    Optional<String> firstName;
    Optional<String> lastName;
}

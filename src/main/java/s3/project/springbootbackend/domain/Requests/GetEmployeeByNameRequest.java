package s3.project.springbootbackend.domain.Requests;

import lombok.Builder;
import lombok.Data;

import java.util.Optional;

@Data
@Builder
public class GetEmployeeByNameRequest {
    Optional<String> firstName;
    Optional<String> lastName;
}

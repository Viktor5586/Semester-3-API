package s3.project.springbootbackend.domain.Responses.Employee;

import lombok.Builder;
import lombok.Data;
import s3.project.springbootbackend.configuration.Generated;

@Data
@Builder
@Generated
public class CreateEmployeeResponse {
    private final Long id;
}

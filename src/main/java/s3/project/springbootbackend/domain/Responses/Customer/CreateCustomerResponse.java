package s3.project.springbootbackend.domain.Responses.Customer;

import lombok.Builder;
import lombok.Data;
import s3.project.springbootbackend.configuration.Generated;

@Data
@Builder
@Generated
public class CreateCustomerResponse {
    private Long userId;
}

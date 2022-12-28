package s3.project.springbootbackend.domain.Responses.Customer;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import s3.project.springbootbackend.configuration.Generated;
import s3.project.springbootbackend.persistence.Entities.CustomerEntity;

@Builder
@Getter
@Setter
@Generated
public class GetUserResponse {
    private CustomerEntity customerEntity;
}

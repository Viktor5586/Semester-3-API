package s3.project.springbootbackend.domain.Responses.Customer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import s3.project.springbootbackend.configuration.Generated;
import s3.project.springbootbackend.persistence.Entities.CustomerEntity;

import java.util.List;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Generated
public class GetAllCustomersResponse {

    private List<CustomerEntity> customerEntities;
}

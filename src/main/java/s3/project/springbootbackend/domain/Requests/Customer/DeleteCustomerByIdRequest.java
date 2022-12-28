package s3.project.springbootbackend.domain.Requests.Customer;

import lombok.Data;
import lombok.Generated;

import javax.validation.constraints.NotBlank;

@Data
@Generated
public class DeleteCustomerByIdRequest {
//    @NotBlank(message = "Please, specify account profile")
    private long customerId;
}

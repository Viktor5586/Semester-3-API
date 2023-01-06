package s3.project.springbootbackend.domain.Requests.Employee;

import lombok.Builder;
import lombok.Data;
import lombok.Generated;

@Data
@Generated
@Builder
public class DeleteEmployeeByIdRequest {
    //    @NotBlank(message = "Please, specify account profile")
    private long employeeId;
}

package s3.project.springbootbackend.domain.Requests;

import lombok.Data;
import lombok.Generated;

@Data
@Generated
public class DeleteEmployeeByIdRequest {
    //    @NotBlank(message = "Please, specify account profile")
    private long employeeId;
}

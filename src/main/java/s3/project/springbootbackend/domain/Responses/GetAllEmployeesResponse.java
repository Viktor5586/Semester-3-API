package s3.project.springbootbackend.domain.Responses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import s3.project.springbootbackend.persistence.Entities.EmployeeEntity;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GetAllEmployeesResponse {
    private List<EmployeeEntity> allEmployeeEntities;
}

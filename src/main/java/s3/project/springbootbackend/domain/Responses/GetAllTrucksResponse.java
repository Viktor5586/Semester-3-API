package s3.project.springbootbackend.domain.Responses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import s3.project.springbootbackend.persistence.Entities.TruckEntity;

import java.util.List;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GetAllTrucksResponse {
    private List<TruckEntity> allTruckEntities;
}

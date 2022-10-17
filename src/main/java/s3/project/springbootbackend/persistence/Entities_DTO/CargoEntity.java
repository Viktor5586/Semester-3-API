package s3.project.springbootbackend.persistence.Entities_DTO;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CargoEntity {
    private Long id;
    private double height;
    private double width;
    private double length;
    private double weight;
}

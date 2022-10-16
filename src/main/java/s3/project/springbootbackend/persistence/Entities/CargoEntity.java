package s3.project.springbootbackend.persistence.Entities;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Builder
@Data
public class CargoEntity {
    private Long id;
    private double height;
    private double width;
    private double length;
    private double weight;
}

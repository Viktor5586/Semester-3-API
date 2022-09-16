package s3.project.springbootbackend.persistence.Entities;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Cargo {
    private double height;
    private double width;
    private double length;
    private double weight;
}

package s3.project.springbootbackend.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Cargo {
    private Long id;
    private double height;
    private double width;
    private double length;
    private double weight;
}

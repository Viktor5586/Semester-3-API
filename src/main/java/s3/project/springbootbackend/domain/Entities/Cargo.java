package s3.project.springbootbackend.domain.Entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import s3.project.springbootbackend.configuration.Generated;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@Generated
public class Cargo {
    private Long id;
    private double height;
    private double width;
    private double length;
    private double weight;
    private boolean approved;
    private long customerId;
    private String startPoint;
    private String endPoint;
    private Date date;


}

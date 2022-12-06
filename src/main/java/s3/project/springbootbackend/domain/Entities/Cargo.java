package s3.project.springbootbackend.domain.Entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import s3.project.springbootbackend.persistence.Entities.CustomerEntity;
import s3.project.springbootbackend.persistence.Entities.TruckEntity;

import java.util.Date;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
public class Cargo {
    private Long id;
    private double height;
    private double width;
    private double length;
    private double weight;
    private boolean approved;
    private CustomerEntity customerEntity;
    private String startPoint;
    private String endPoint;
    private Date date;


}

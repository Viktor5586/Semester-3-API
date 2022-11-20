package s3.project.springbootbackend.persistence.Entities;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Builder
@Getter
@Setter
public class OrderEntity {
    private final String id;
    private CargoEntity cargoEntity;
    private String fromLocation; //later type location??
    private String toLocation;
    private Date date;
}

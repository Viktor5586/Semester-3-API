package s3.project.springbootbackend.persistence.Entities;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import s3.project.springbootbackend.persistence.Entities.Cargo;

import java.util.Date;

@Builder
@Getter
@Setter
public class Order {
    private final String id;
    private Cargo cargo;
    private String fromLocation; //later type location??
    private String toLocation;
    private Date date;
}

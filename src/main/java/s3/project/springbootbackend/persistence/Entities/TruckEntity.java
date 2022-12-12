package s3.project.springbootbackend.persistence.Entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.aspectj.bridge.Message;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

//@SqlResultSetMapping(name="sth", classes ={
//        @ConstructorResult(targetClass = Message.class,
//        columns = {
//                @ColumnResult(name = "id"),
//                @ColumnResult(name = "licence_plate"),
//                @ColumnResult(name = "location"),
//                @ColumnResult(name = "height"),
//                @ColumnResult(name = "width"),
//                @ColumnResult(name = "length"),
//                @ColumnResult(name = "max_weight"),
//                @ColumnResult(name = "tank_volume"),
//                @ColumnResult(name = "fuel_consumprion_per_km"),
//        })
//})
@Entity
@Table(name = "truck")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TruckEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id = 0L;

    @NotBlank
    @Length(min = 2 ,max = 8)
    @Column(unique = true, name = "licence_plate")
    private String licencePlate;

    @NotBlank
    @Length(min = 2 ,max = 50)
    @Column(name = "location")
    private  String location;

    @NotNull
    @Column(name = "height")
    private  double height;

    @NotNull
    @Column(name = "width")
    private  double width;

    @NotNull
    @Column(name = "length")
    private  double length;

    @NotNull
    @Column(name = "max_weight")
    private  double maxWeight;

    @NotNull
    @Column(name = "tank_volume")
    private  double tankVolume;

    @NotNull
    @Column(name = "fuel_consumprion_per_km")
    private  double fuelConsumptionPerKm;

}

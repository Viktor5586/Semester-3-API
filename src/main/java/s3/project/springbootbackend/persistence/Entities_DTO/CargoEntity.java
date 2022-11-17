package s3.project.springbootbackend.persistence.Entities_DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Entity
@Table(name = "orders")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CargoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, name = "id")
    private Long id;

    @NotNull
    @Column(name = "cargo_height")
    private double height;

    @NotNull
    @Column(name = "cargo_width")
    private double width;

    @NotNull
    @Column(name = "cargo_length")
    private double length;

    @NotNull
    @Column(name = "cargo_weight")
    private double weight;
    /*@NotNull
    @OneToMany
    @JoinColumn(name = "truck_id")
    private List<TruckEntity> truckEntity;

    @NotNull
    @OneToOne
    @JoinColumn(name = "customer_id")
    private CustomerEntity customerEntity;*/

    @NotBlank
    @Column(name = "startPoint")
    private String startPoint;

    @NotBlank
    @Column(name = "endPoint")
    private String endPoint;

    @Future
    @Column(name = "date")
    private Date date;

}

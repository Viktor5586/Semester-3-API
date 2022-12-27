package s3.project.springbootbackend.persistence.Entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "customer")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, name = "id")
    private Long id;

    @NotBlank
    @Length(min = 2 ,max = 20)
    @Column(name = "first_name")
    private String firstName;

    @NotBlank
    @Length(min = 2 ,max = 20)
    @Column(name = "last_name")
    private String lastName;

}

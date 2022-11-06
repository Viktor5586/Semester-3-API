package s3.project.springbootbackend.persistence.Entities_DTO;

import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "employee")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeEntity {
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

    @NotBlank
    @Length(min = 2 ,max = 20)
    @Column(unique = true, name = "username")
    private String username;

    @NotBlank
    @Length(min = 2 ,max = 20)
    @Column(name = "password")
    private String password;

}

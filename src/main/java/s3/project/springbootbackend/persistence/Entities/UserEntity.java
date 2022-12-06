package s3.project.springbootbackend.persistence.Entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Set;

@Entity
@Table(name = "user")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotBlank
    @Length(min = 2, max = 40)
    @Column(name = "username")
    private String username;

    @Column(name = "password")
    @Length(max = 100)
    private String password;

    @OneToOne(optional = true)
    @JoinColumn(name = "customer_id")
    private CustomerEntity customer;

    @OneToOne(optional = true)
    @JoinColumn(name = "employee_id")
    private EmployeeEntity employee;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private Set<UserRoleEntity> userRoles;
}

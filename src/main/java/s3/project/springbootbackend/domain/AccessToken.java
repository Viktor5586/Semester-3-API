package s3.project.springbootbackend.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import java.util.List;

@Data
@Generated
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AccessToken {
    private String subject;
    private List<String> roles;
    private String username;
    private Long customerId;
    private Long employeeId;

    @JsonIgnore
    public boolean hasRole(String roleName) {
        if (roles == null) {
            return false;
        }
        return roles.contains(roleName);
    }
}

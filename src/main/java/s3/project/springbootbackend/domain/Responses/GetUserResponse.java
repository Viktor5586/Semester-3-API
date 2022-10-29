package s3.project.springbootbackend.domain.Responses;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import s3.project.springbootbackend.persistence.Entities_DTO.CustomerEntity;

@Builder
@Getter
@Setter
public class GetUserResponse {
    private CustomerEntity customerEntity;
}

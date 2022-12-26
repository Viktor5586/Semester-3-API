package s3.project.springbootbackend.domain.Responses;

import lombok.Builder;
import lombok.Data;
import s3.project.springbootbackend.configuration.Generated;

@Data
@Builder
@Generated
public class CreateUserResponse {
    private Long userId;
}

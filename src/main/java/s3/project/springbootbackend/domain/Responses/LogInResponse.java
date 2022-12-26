package s3.project.springbootbackend.domain.Responses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import s3.project.springbootbackend.configuration.Generated;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Generated
public class LogInResponse {

    private String accessToken;
}

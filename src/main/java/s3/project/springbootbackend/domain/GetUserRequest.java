package s3.project.springbootbackend.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Builder
@Getter
@Setter
public class GetUserRequest {
    @NotNull
    private String id;
}

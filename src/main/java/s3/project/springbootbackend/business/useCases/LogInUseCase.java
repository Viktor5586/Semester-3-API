package s3.project.springbootbackend.business.useCases;

import s3.project.springbootbackend.domain.Requests.LogInRequest;
import s3.project.springbootbackend.domain.Responses.LogInResponse;

public interface LogInUseCase {
    LogInResponse login(LogInRequest loginRequest);
}

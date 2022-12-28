package s3.project.springbootbackend.business.useCases.LogIn;

import s3.project.springbootbackend.domain.Requests.LogIn.LogInRequest;
import s3.project.springbootbackend.domain.Responses.LogInResponse;

public interface LogInUseCase {
    LogInResponse login(LogInRequest loginRequest);
}

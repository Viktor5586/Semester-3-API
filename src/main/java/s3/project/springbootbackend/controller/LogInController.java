package s3.project.springbootbackend.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import s3.project.springbootbackend.business.useCases.LogInUseCase;
import s3.project.springbootbackend.domain.Requests.LogInRequest;
import s3.project.springbootbackend.domain.Responses.LogInResponse;

import javax.validation.Valid;

@RestController
@RequestMapping("/login")
@RequiredArgsConstructor
public class LogInController {

    private final LogInUseCase loginUseCase;

    @PostMapping
    public ResponseEntity<LogInResponse> login(@RequestBody @Valid LogInRequest loginRequest) {
        LogInResponse loginResponse = loginUseCase.login(loginRequest);
        return ResponseEntity.ok(loginResponse);
    }
}

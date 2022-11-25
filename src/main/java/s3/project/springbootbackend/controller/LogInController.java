package s3.project.springbootbackend.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import s3.project.springbootbackend.business.useCases.LogInUseCase;
import s3.project.springbootbackend.domain.Requests.LogInRequest;
import s3.project.springbootbackend.domain.Responses.LogInResponse;

import javax.validation.Valid;

@RestController
@RequestMapping("/login")
@CrossOrigin(origins = {"http://localhost:3000"})
@RequiredArgsConstructor
public class LogInController {

    private final LogInUseCase loginUseCase;

    @PostMapping
    public ResponseEntity<LogInResponse> login(@RequestBody @Valid LogInRequest loginRequest) {
        LogInResponse loginResponse = loginUseCase.login(loginRequest);
        return ResponseEntity.ok(loginResponse);
    }
}

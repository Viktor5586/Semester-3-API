package s3.project.springbootbackend.controller;

import lombok.Generated;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import s3.project.springbootbackend.business.useCases.LogIn.LogInUseCase;
import s3.project.springbootbackend.domain.Requests.LogIn.LogInRequest;
import s3.project.springbootbackend.domain.Responses.LogInResponse;

import javax.validation.Valid;

@Generated
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

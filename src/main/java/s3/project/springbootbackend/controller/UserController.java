package s3.project.springbootbackend.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import s3.project.springbootbackend.business.useCases.User.CreateUserUseCase;
import s3.project.springbootbackend.business.useCases.User.GetAllUsersUseCase;
import s3.project.springbootbackend.domain.Requests.CreateUserRequest;
import s3.project.springbootbackend.domain.Responses.CreateUserResponse;
import s3.project.springbootbackend.domain.Responses.GetAllUsersResponse;

import javax.validation.Valid;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
@CrossOrigin(origins = {"http://localhost:3000"})
public class UserController {
    private GetAllUsersUseCase getAllUsersUseCase;

    private CreateUserUseCase createUserUseCase;
    @GetMapping
    public ResponseEntity<?> getUsers(){
        GetAllUsersResponse response = getAllUsersUseCase.getAllUsers();
        return ResponseEntity.ok(response);
    }

    @PostMapping("/add")
    public ResponseEntity<?> createUser(@RequestBody @Valid CreateUserRequest request) {
        CreateUserResponse response = createUserUseCase.createUser(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }


    //add mapping




}

package s3.project.springbootbackend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import s3.project.springbootbackend.business.CreateUserUseCase;
import s3.project.springbootbackend.business.GetAllUsersUseCase;
import s3.project.springbootbackend.business.GetUserUseCase;
import s3.project.springbootbackend.domain.*;
import s3.project.springbootbackend.persistence.Entities.UserEntity;
import s3.project.springbootbackend.persistence.UserRepository;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private GetUserUseCase userUseCase;
    private GetAllUsersUseCase getAllUsersUseCase;
    private UserRepository userRepository;
    private CreateUserUseCase createUserUseCase;

    public UserController(){}

    public UserController(GetUserUseCase getUserUseCase){
        this.userUseCase = getUserUseCase;
    }

    public UserController(GetAllUsersUseCase getAllUsersUseCase){
        this.getAllUsersUseCase = getAllUsersUseCase;
    }

    //@PostMapping("/add")
    @PostMapping()
    public ResponseEntity<CreateUserResponse> createUser(@RequestBody @Valid CreateUserRequest request) {
        CreateUserResponse response = createUserUseCase.createUser(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }


    //add mapping




}

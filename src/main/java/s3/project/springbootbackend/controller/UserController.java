package s3.project.springbootbackend.controller;

import lombok.AllArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import s3.project.springbootbackend.business.CreateUserUseCase;
import s3.project.springbootbackend.business.GetAllUsersUseCase;
import s3.project.springbootbackend.business.GetUserUseCase;
import s3.project.springbootbackend.domain.*;
import s3.project.springbootbackend.persistence.UserRepository;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {
    private GetUserUseCase userUseCase;
    private GetAllUsersUseCase getAllUsersUseCase;
    private UserRepository userRepository;

    private CreateUserUseCase createUserUseCase;

    /*public UserController(GetUserUseCase getUserUseCase){
        this.userUseCase = getUserUseCase;
    }

    public UserController(GetAllUsersUseCase getAllUsersUseCase){
        this.getAllUsersUseCase = getAllUsersUseCase;
    }*/

    @GetMapping
    public ResponseEntity<?> getUsers(){
        GetAllUsersResponse response = getAllUsersUseCase.getAllUsers();
        return ResponseEntity.ok(response);
    }

    @PostMapping()
    public ResponseEntity<?> createUser(@RequestBody @Valid CreateUserRequest request) {
        CreateUserResponse response = createUserUseCase.createUser(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }


    //add mapping




}

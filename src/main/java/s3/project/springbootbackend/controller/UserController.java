package s3.project.springbootbackend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import s3.project.springbootbackend.business.GetAllUsersUseCase;
import s3.project.springbootbackend.business.GetUserUseCase;
import s3.project.springbootbackend.domain.GetAllUsersResponse;
import s3.project.springbootbackend.domain.GetUserResponse;

@RestController
@RequestMapping("/users")
public class UserController {
    private GetUserUseCase userUseCase;
    private GetAllUsersUseCase getAllUsersUseCase;

    public UserController(){}
    public UserController(GetUserUseCase getUserUseCase){
        this.userUseCase = getUserUseCase;
    }

    public UserController(GetAllUsersUseCase getAllUsersUseCase){
        this.getAllUsersUseCase = getAllUsersUseCase;
    }




}

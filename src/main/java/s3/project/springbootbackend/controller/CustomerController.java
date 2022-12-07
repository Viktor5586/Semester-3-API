package s3.project.springbootbackend.controller;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import s3.project.springbootbackend.business.useCases.User.CreateCustomerUseCase;
import s3.project.springbootbackend.business.useCases.User.GetAllCustomersUseCase;
import s3.project.springbootbackend.business.useCases.User.UpdateCustomerUseCase;
import s3.project.springbootbackend.domain.Requests.CreateCustomerRequest;
import s3.project.springbootbackend.domain.Requests.UpdateCustomerRequest;
import s3.project.springbootbackend.domain.Responses.CreateUserResponse;
import s3.project.springbootbackend.domain.Responses.GetAllUsersResponse;

import javax.validation.Valid;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
@NoArgsConstructor
@CrossOrigin(origins = {"http://localhost:3000"})
public class CustomerController {
    @Autowired
    private GetAllCustomersUseCase getAllCustomersUseCase;
    //@Autowired
    private CreateCustomerUseCase createCustomerUseCase;
    @Autowired
    private UpdateCustomerUseCase updateCustomerUseCase;
    @GetMapping
    public ResponseEntity<?> getCustomers(){
        GetAllUsersResponse response = getAllCustomersUseCase.getAllUsers();
        return ResponseEntity.ok(response);
    }

    @PutMapping()
    public ResponseEntity<?> updateCustomer(@RequestBody @Valid UpdateCustomerRequest request){
        ResponseEntity response = updateCustomerUseCase.updateCustomer(request);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(response);
    }

    @PostMapping("/add")
    public ResponseEntity<?> createCustomer(@RequestBody @Valid CreateCustomerRequest request) {
        CreateUserResponse response = createCustomerUseCase.createUser(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }


    //add mapping




}

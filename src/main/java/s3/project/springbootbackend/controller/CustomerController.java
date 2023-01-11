package s3.project.springbootbackend.controller;

import lombok.AllArgsConstructor;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import s3.project.springbootbackend.business.useCases.User.*;
import s3.project.springbootbackend.domain.Entities.Customer;
import s3.project.springbootbackend.domain.Requests.Customer.CreateCustomerRequest;
import s3.project.springbootbackend.domain.Requests.Customer.DeleteCustomerByIdRequest;
import s3.project.springbootbackend.domain.Requests.Customer.UpdateCustomerRequest;
import s3.project.springbootbackend.domain.Responses.Customer.CreateCustomerResponse;
import s3.project.springbootbackend.domain.Responses.Customer.GetAllUsersResponse;

import javax.validation.Valid;
import java.util.Optional;

@Generated
@RestController
@RequestMapping("/users")
@AllArgsConstructor
@NoArgsConstructor
@CrossOrigin(origins = {"http://localhost:3000"})
public class CustomerController {
    @Autowired
    private GetAllCustomersUseCase getAllCustomersUseCase;
    @Autowired
    private GetCustomerUseCase getCustomerUseCase;
    @Autowired
    private CreateCustomerUseCase createCustomerUseCase;
    @Autowired
    private UpdateCustomerUseCase updateCustomerUseCase;
    @Autowired
    private DeleteCustomerUseCase deleteCustomerUseCase;
    @GetMapping()
    public ResponseEntity<?> getCustomers(@RequestParam(value = "id", required = false)Long id){
        GetAllUsersResponse response;
        if (id == null){
            response = getAllCustomersUseCase.getAllUsers();
        }else {
            final Optional<Customer>customer = getCustomerUseCase.getUser(id);
            if (customer.isPresent()){
                return ResponseEntity.ok().body(customer.get());
            }else{
                return ResponseEntity.notFound().build();
            }
        }

        return ResponseEntity.ok(response);
    }

    @PutMapping()
    public ResponseEntity<?> updateCustomer(@RequestBody @Valid UpdateCustomerRequest request){
        ResponseEntity response = updateCustomerUseCase.updateCustomer(request);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(response);
    }

    @PostMapping("/add")
    public ResponseEntity<?> createCustomer(@RequestBody @Valid CreateCustomerRequest request) {
        CreateCustomerResponse response = createCustomerUseCase.createUser(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<?> deleteCustomer(@RequestBody @Valid DeleteCustomerByIdRequest request){
        deleteCustomerUseCase.delete(request);
        return ResponseEntity.ok().body("Profile deleted");
    }


    //add mapping




}

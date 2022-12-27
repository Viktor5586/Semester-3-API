package s3.project.springbootbackend.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import s3.project.springbootbackend.business.useCases.Employee.*;
import s3.project.springbootbackend.domain.Requests.CreateEmployeeRequest;
import s3.project.springbootbackend.domain.Requests.DeleteEmployeeByIdRequest;
import s3.project.springbootbackend.domain.Requests.GetEmployeeByIdRequest;
import s3.project.springbootbackend.domain.Requests.GetEmployeeByNameRequest;
import s3.project.springbootbackend.domain.Responses.CreateEmployeeResponse;
import s3.project.springbootbackend.domain.Responses.GetAllEmployeesResponse;

import javax.validation.Valid;

@RestController
@RequestMapping("/employees")
@AllArgsConstructor
@CrossOrigin(origins = {"http://localhost:3000"})
public class EmployeeController {
    private CreateEmployeeUseCase createEmployeeUseCase;
    private GetAllEmployeesUseCase getAllEmployeesUseCase;
//    private GetEmployeeByIdUseCase getEmployeeByIdUseCase;
//    private GetEmployeeByNameUseCase getEmployeeByNameUseCase;
    private DeleteEmployeeUseCase deleteEmployeeUseCase;
    @GetMapping()
    public ResponseEntity<?> getAllEmployees(){
        GetAllEmployeesResponse response = getAllEmployeesUseCase.getAllEmployees();
        return ResponseEntity.ok(response);
    }

//    @GetMapping("/id") // fix
//    public ResponseEntity<?> getEmployeeById(@RequestBody @Valid GetEmployeeByIdRequest request){
//        GetAllEmployeesResponse response = getEmployeeByIdUseCase.getEmployeeById(request);
//        return ResponseEntity.ok(response);
//    }
//
//    @GetMapping("/name") // doesn't return unique result error
//    public ResponseEntity<?> getEmployeeByName(@RequestBody @Valid GetEmployeeByNameRequest request){
//        Optional<GetAllEmployeesResponse> response = getEmployeeByNameUseCase.getEmployeeByName(request);
//        return ResponseEntity.ok(response);
//    }

    @DeleteMapping("/delete")
    public ResponseEntity<?> deleteEmployee(@RequestBody @Valid DeleteEmployeeByIdRequest request){
        deleteEmployeeUseCase.delete(request);
        return ResponseEntity.ok().body("Profile deleted");
    }

    @PostMapping("/add")
    public ResponseEntity<?> createEmployee(@RequestBody @Valid CreateEmployeeRequest request){
        CreateEmployeeResponse response = createEmployeeUseCase.createEmployee(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}

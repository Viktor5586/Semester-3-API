package s3.project.springbootbackend.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import s3.project.springbootbackend.business.useCases.Employee.*;
import s3.project.springbootbackend.configuration.security.isauthenticated.IsAuthenticated;
import s3.project.springbootbackend.domain.Requests.Employee.CreateEmployeeRequest;
import s3.project.springbootbackend.domain.Requests.Employee.DeleteEmployeeByIdRequest;
import s3.project.springbootbackend.domain.Responses.Employee.CreateEmployeeResponse;
import s3.project.springbootbackend.domain.Responses.Employee.GetAllEmployeesResponse;

import javax.annotation.security.RolesAllowed;
import javax.validation.Valid;

@RestController
@RequestMapping("/employees")
@AllArgsConstructor
@CrossOrigin(origins = {"http://localhost:3000"})
public class EmployeeController {
    private CreateEmployeeUseCase createEmployeeUseCase;
    private GetAllEmployeesUseCase getAllEmployeesUseCase;
    private DeleteEmployeeUseCase deleteEmployeeUseCase;
    @IsAuthenticated
    @RolesAllowed({"ROLE_EMPLOYEE"})
    @GetMapping()
    public ResponseEntity<?> getAllEmployees(){
        GetAllEmployeesResponse response = getAllEmployeesUseCase.getAllEmployees();
        return ResponseEntity.ok(response);
    }
    @IsAuthenticated
    @RolesAllowed({"ROLE_EMPLOYEE"})
    @DeleteMapping("/delete")
    public ResponseEntity<?> deleteEmployee(@RequestBody @Valid DeleteEmployeeByIdRequest request){
        deleteEmployeeUseCase.delete(request);
        return ResponseEntity.ok().body("Profile deleted");
    }
    @IsAuthenticated
    @RolesAllowed({"ROLE_EMPLOYEE"})
    @PostMapping("/add")
    public ResponseEntity<?> createEmployee(@RequestBody @Valid CreateEmployeeRequest request){
        CreateEmployeeResponse response = createEmployeeUseCase.createEmployee(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}

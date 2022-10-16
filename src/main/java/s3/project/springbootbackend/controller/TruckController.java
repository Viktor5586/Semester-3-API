package s3.project.springbootbackend.controller;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import s3.project.springbootbackend.business.CreateTruckUseCase;
import s3.project.springbootbackend.business.GetAllTrucksUseCase;
import s3.project.springbootbackend.domain.CreateTruckRequest;
import s3.project.springbootbackend.domain.CreateTruckResponse;
import s3.project.springbootbackend.domain.GetAllTrucksResponse;

import javax.validation.Valid;

@RestController
@RequestMapping("/trucks")
@AllArgsConstructor
@CrossOrigin(origins = {"http://localhost:3000"})
public class TruckController {
    private GetAllTrucksUseCase getAllTrucksUseCase;
    private CreateTruckUseCase createTruckUseCase;

    @GetMapping()
    public ResponseEntity<?> getAllTrucks(){
        GetAllTrucksResponse response = getAllTrucksUseCase.getAllTrucks();
        return ResponseEntity.ok(response);
    }

    @PostMapping("/add")
    public ResponseEntity<?> createTruck(@RequestBody @Valid CreateTruckRequest request){
        CreateTruckResponse response = createTruckUseCase.createTruck(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

}

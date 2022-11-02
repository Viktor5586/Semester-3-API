package s3.project.springbootbackend.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import s3.project.springbootbackend.business.useCases.Truck.CreateTruckUseCase;
import s3.project.springbootbackend.business.useCases.Truck.GetAllTrucksUseCase;
import s3.project.springbootbackend.business.useCases.Truck.GetTruckByIdUseCase;
import s3.project.springbootbackend.business.useCases.Truck.GetTruckByLocationUseCase;
import s3.project.springbootbackend.domain.Requests.CreateTruckRequest;
import s3.project.springbootbackend.domain.Requests.GetAllTrucksPerLocationRequest;
import s3.project.springbootbackend.domain.Requests.GetTruckByIdRequest;
import s3.project.springbootbackend.domain.Responses.CreateTruckResponse;
import s3.project.springbootbackend.domain.Responses.GetAllTrucksResponse;

import javax.validation.Valid;

@RestController
@RequestMapping("/trucks")
@AllArgsConstructor
@CrossOrigin(origins = {"http://localhost:3000"})
public class TruckController {
    private GetAllTrucksUseCase getAllTrucksUseCase;
    private GetTruckByLocationUseCase getTruckByLocationUseCase;
    private GetTruckByIdUseCase getTruckByIdUseCase;
    private CreateTruckUseCase createTruckUseCase;

    @GetMapping()
    public ResponseEntity<?> getAllTrucks(){
        GetAllTrucksResponse response = getAllTrucksUseCase.getAllTrucks();
        return ResponseEntity.ok(response);
    }

    @GetMapping("/location")
    public ResponseEntity<?> getTrucksPerLocation(@RequestBody @Valid GetAllTrucksPerLocationRequest request){
        GetAllTrucksResponse response = getTruckByLocationUseCase.getTruckByLocation(request);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/id")
    public ResponseEntity<?> getTruckById(@RequestBody @Valid GetTruckByIdRequest request){
        GetAllTrucksResponse response = getTruckByIdUseCase.getTruckById(request);
        return ResponseEntity.ok(response);
    }


    @PostMapping("/add")
    public ResponseEntity<?> createTruck(@RequestBody @Valid CreateTruckRequest request){
        CreateTruckResponse response = createTruckUseCase.createTruck(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

}

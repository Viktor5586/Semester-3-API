package s3.project.springbootbackend.controller;

import lombok.AllArgsConstructor;
import lombok.Generated;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import s3.project.springbootbackend.business.useCases.Truck.*;
import s3.project.springbootbackend.configuration.security.isauthenticated.IsAuthenticated;
import s3.project.springbootbackend.domain.Requests.Truck.CreateTruckRequest;
import s3.project.springbootbackend.domain.Requests.Truck.DeleteTruckRequest;
import s3.project.springbootbackend.domain.Requests.Truck.GetTrucksByAnyParameterRequest;
import s3.project.springbootbackend.domain.Responses.Truck.CreateTruckResponse;
import s3.project.springbootbackend.domain.Responses.Truck.GetAllTrucksResponse;

import javax.annotation.security.RolesAllowed;
import javax.validation.Valid;

@Generated
@RestController
@RequestMapping("/trucks")
@AllArgsConstructor
@CrossOrigin(origins = {"http://localhost:3000"})
public class TruckController {
    private GetTrucksByAnyParameterUseCase getTrucksByAnyParameterUseCase;
    private CreateTruckUseCase createTruckUseCase;
    private DeleteTruckUseCase deleteTruckUseCase;

    @GetMapping()
    public ResponseEntity<?> getAllTrucks(@RequestParam(value = "id", required = false)Long id,
                                          @RequestParam(value = "licencePlate",required = false)String licencePlate,
                                          @RequestParam(value = "location", required = false)String location,
                                          @RequestParam(value = "height",required = false)Double height,
                                          @RequestParam(value = "width", required = false)Double width,
                                          @RequestParam(value = "length",required = false)Double length,
                                          @RequestParam(value = "maxWeight", required = false)Double maxWeight,
                                          @RequestParam(value = "tankVolume",required = false)Double tankVolume,
                                          @RequestParam(value = "fuelConsumptionPerKm",required = false)Double fuelConsumptionPerKm){

        GetTrucksByAnyParameterRequest request = GetTrucksByAnyParameterRequest.builder()
                .id(id)
                .licencePlate(licencePlate)
                .location(location)
                .height(height)
                .width(width)
                .length(length)
                .maxWeight(maxWeight)
                .tankVolume(tankVolume)
                .fuelConsumptionPerKm(fuelConsumptionPerKm).build();


        GetAllTrucksResponse response = getTrucksByAnyParameterUseCase.getTrucksByAnyParameterUseCase(request);

        return ResponseEntity.ok(response);
    }
    @IsAuthenticated
    @RolesAllowed({"ROLE_EMPLOYEE"})
    @DeleteMapping("/delete")
    public ResponseEntity<?> deleteTruck(@RequestBody @Valid DeleteTruckRequest request){
        System.out.println(request);
        deleteTruckUseCase.delete(request);
        return ResponseEntity.ok().body("Truck has been deleted successfully");
    }

    @IsAuthenticated
    @RolesAllowed({"ROLE_EMPLOYEE"})
    @PostMapping("/add")
    public ResponseEntity<?> createTruck(@RequestBody @Valid CreateTruckRequest request){
        CreateTruckResponse response = createTruckUseCase.createTruck(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

}

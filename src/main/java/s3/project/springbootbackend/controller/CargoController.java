package s3.project.springbootbackend.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import s3.project.springbootbackend.business.CreateCargoUseCase;
import s3.project.springbootbackend.business.GetAllCargosUseCase;
import s3.project.springbootbackend.domain.CreateCargoRequest;
import s3.project.springbootbackend.domain.CreateCargoResponse;
import s3.project.springbootbackend.domain.GetAllCargosResponse;

import javax.validation.Valid;

@RestController
@RequestMapping("/cargos")
@AllArgsConstructor
@CrossOrigin(origins = {"http://localhost:3000"})
public class CargoController {

    private CreateCargoUseCase createCargoUseCase;
    private GetAllCargosUseCase getAllCargosUseCase;

    @GetMapping
    public ResponseEntity<?> getCargos(){
        GetAllCargosResponse response = getAllCargosUseCase.getAllCargos();
        return ResponseEntity.ok(response);
    }

    @PostMapping("/add")
    public ResponseEntity<?> createCargo(@RequestBody @Valid CreateCargoRequest request){
        CreateCargoResponse response = createCargoUseCase.createCargo(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}

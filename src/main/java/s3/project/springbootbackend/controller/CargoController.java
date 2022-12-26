package s3.project.springbootbackend.controller;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import s3.project.springbootbackend.business.useCases.Cargo.ApproveCargoUseCase;
import s3.project.springbootbackend.business.useCases.Cargo.CreateCargoUseCase;
import s3.project.springbootbackend.business.useCases.Cargo.DeleteCargoUseCase;
import s3.project.springbootbackend.business.useCases.Cargo.GetAllCargosUseCase;
import s3.project.springbootbackend.domain.Requests.ApproveCargoRequest;
import s3.project.springbootbackend.domain.Requests.CreateCargoRequest;
import s3.project.springbootbackend.domain.Requests.DeleteCargoRequest;
import s3.project.springbootbackend.domain.Responses.CreateCargoResponse;
import s3.project.springbootbackend.domain.Responses.GetAllCargosResponse;

import javax.validation.Valid;

@RestController
@RequestMapping("/cargos")
@CrossOrigin(origins = {"http://localhost:3000"})
@RequiredArgsConstructor
@AllArgsConstructor
public class CargoController {
    @Autowired
    private CreateCargoUseCase createCargoUseCase;
    @Autowired
    private GetAllCargosUseCase getAllCargosUseCase;
    @Autowired
    private DeleteCargoUseCase deleteCargoUseCase;
    @Autowired
    private ApproveCargoUseCase approveCargoUseCase;

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

    @PutMapping()
    public ResponseEntity<?> updateCargo(@RequestBody @Valid ApproveCargoRequest request){
        approveCargoUseCase.approve(request);
        return ResponseEntity.ok().body("Order has been approved");
    }

    @DeleteMapping("/delete")
    public ResponseEntity<?> deleteCargo(@RequestBody @Valid DeleteCargoRequest request){
        deleteCargoUseCase.delete(request);
        return  ResponseEntity.ok().body("Order has been deleted");
    }
}

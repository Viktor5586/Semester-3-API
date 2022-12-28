package s3.project.springbootbackend.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import s3.project.springbootbackend.business.useCases.statistics.GetApprovedOrdersUseCase;
import s3.project.springbootbackend.business.useCases.statistics.GetTruckStatisticsUseCase;

import javax.validation.Valid;

@RestController
@RequestMapping("/statistics")
@AllArgsConstructor
@CrossOrigin(origins = {"http://localhost:3000"})
public class StatisticsController {
    private GetTruckStatisticsUseCase getTruckStatisticsUseCase;
    private GetApprovedOrdersUseCase approvedOrdersUseCase;
    @GetMapping()
    public long getTruckStatistics(){
        return getTruckStatisticsUseCase.getTrucksStatistics();
    }
    @GetMapping("/cargos")
    public long getGargosStatistics(){
        return approvedOrdersUseCase.getAllApprovedOrders(true);
    }

}

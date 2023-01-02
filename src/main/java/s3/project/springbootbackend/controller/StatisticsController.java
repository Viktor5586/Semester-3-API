package s3.project.springbootbackend.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import s3.project.springbootbackend.business.useCases.statistics.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/statistics")
@AllArgsConstructor
@CrossOrigin(origins = {"http://localhost:3000"})
public class StatisticsController {
    private GetTruckStatisticsUseCase getTruckStatisticsUseCase;
    private GetApprovedOrdersUseCase approvedOrdersUseCase;
    private GetNotApprovedOrdersUseCase getNotApprovedOrdersUseCase;
    private GetCountOfCustomersUseCase getCountOfCustomersUseCase;
    private GetCountOfEmployeesUseCase getCountOfEmployeesUseCase;
    private GetCountOfOrdersCurrentDateUseCase getCountOfOrdersCurrentDateUseCase;
    private GetCountOfOrdersBeforeCurrentDateUseCase getCountOfOrdersBeforeCurrentDateUseCase;
    private GetCountOfOrdersAfterCurrentDateUseCase getCountOfOrdersAfterCurrentDateUseCase;
//    private GetAllStats getAllStats;

    @GetMapping()
    public List<Long> getGargosStatistics() {
      List<Long> stats =  new ArrayList<>();
       stats.add(getTruckStatisticsUseCase.getTrucksStatistics());
       stats.add(approvedOrdersUseCase.getAllApprovedOrders(true));
       stats.add(getNotApprovedOrdersUseCase.getAllNotApprovedOrdersCount(false));
       stats.add(getCountOfCustomersUseCase.getCountOfCustomers());
       stats.add(getCountOfEmployeesUseCase.getCountOfEmployees());
       stats.add(getCountOfOrdersCurrentDateUseCase.getOrdersCount(new Date()));
       stats.add(getCountOfOrdersBeforeCurrentDateUseCase.getOrdersCount(new Date()));
       stats.add(getCountOfOrdersAfterCurrentDateUseCase.getOrdersCount(new Date()));
       return stats;
    }
}

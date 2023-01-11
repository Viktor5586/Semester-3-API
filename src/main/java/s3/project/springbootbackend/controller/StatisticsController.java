package s3.project.springbootbackend.controller;

import lombok.AllArgsConstructor;
import lombok.Generated;
import org.springframework.web.bind.annotation.*;
import s3.project.springbootbackend.business.useCases.statistics.*;

import java.util.*;

@Generated
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
    public Map<String, Long> getGargosStatistics() {
      Map<String, Long> stats =  new HashMap<>();
       stats.put("trucks",getTruckStatisticsUseCase.getTrucksStatistics());
       stats.put("approved",approvedOrdersUseCase.getAllApprovedOrders(true));
       stats.put("notApproved",getNotApprovedOrdersUseCase.getAllNotApprovedOrdersCount(false));
       stats.put("customers",getCountOfCustomersUseCase.getCountOfCustomers());
       stats.put("employees",getCountOfEmployeesUseCase.getCountOfEmployees());
       stats.put("ordersToday",getCountOfOrdersCurrentDateUseCase.getOrdersCount(new Date()));
       stats.put("ordersBefore",getCountOfOrdersBeforeCurrentDateUseCase.getOrdersCount(new Date()));
       stats.put("ordersAfter",getCountOfOrdersAfterCurrentDateUseCase.getOrdersCount(new Date()));
       return stats;
    }

//    @GetMapping("/trucks")
//    public Long getTruckStatistics(){
//        return getTruckStatisticsUseCase.getTrucksStatistics();
//    }
//
//    @GetMapping("/orders/{approved}")
//    public Long getOrdersStatistics(@PathVariable String approved){
//        if (approved.equals("approved")){
//            return approvedOrdersUseCase.getAllApprovedOrders(true);
//        }else if (approved.equals("notApproved")){
//            return getNotApprovedOrdersUseCase.getAllNotApprovedOrdersCount(false);
//        }else {
//           return null;
//        }
////        return getTruckStatisticsUseCase.getTrucksStatistics();
//    }
//
//    @GetMapping("/users/{role}")
//    public Long getUserStatistics(@PathVariable String role){
//        if (role.equals("CUSTOMER")){
//            return getCountOfCustomersUseCase.getCountOfCustomers();
//
//        } else if (role.equals("EMPLOYEE")) {
//            return getCountOfEmployeesUseCase.getCountOfEmployees();
//        }else {
//            return null;
//        }
////        return getTruckStatisticsUseCase.getTrucksStatistics();
//    }
//    @GetMapping("/ordersDate/{date}")
//    public Long getOrderByTimeStatistics(@PathVariable Date date){
//        if (date.after(new Date())){
//            return getCountOfOrdersAfterCurrentDateUseCase.getOrdersCount(new Date());
//        }else if(date.before(new Date())){
//            return getCountOfOrdersBeforeCurrentDateUseCase.getOrdersCount(new Date());
//        }else if(date == new Date()){
//            return getCountOfOrdersCurrentDateUseCase.getOrdersCount(new Date());
//        }else {
//            return null;
//        }
////        return getTruckStatisticsUseCase.getTrucksStatistics();
//    }
}

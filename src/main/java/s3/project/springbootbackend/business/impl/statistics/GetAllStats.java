package s3.project.springbootbackend.business.impl.statistics;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import s3.project.springbootbackend.business.useCases.statistics.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class GetAllStats implements GetAllStatsUseCase {

    private GetTruckStatisticsUseCase getTruckStatisticsUseCase;
    private GetApprovedOrdersUseCase approvedOrdersUseCase;
    private GetNotApprovedOrdersUseCase getNotApprovedOrdersUseCase;
    private GetCountOfCustomersUseCase getCountOfCustomersUseCase;
    private GetCountOfEmployeesUseCase getCountOfEmployeesUseCase;
    private GetCountOfOrdersCurrentDateUseCase getCountOfOrdersCurrentDateUseCase;
    private GetCountOfOrdersBeforeCurrentDateUseCase getCountOfOrdersBeforeCurrentDateUseCase;
    private GetCountOfOrdersAfterCurrentDateUseCase getCountOfOrdersAfterCurrentDateUseCase;

    public List<Long> getStats(){
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

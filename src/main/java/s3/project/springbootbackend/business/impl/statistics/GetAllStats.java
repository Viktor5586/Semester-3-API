package s3.project.springbootbackend.business.impl.statistics;

import lombok.AllArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import s3.project.springbootbackend.business.useCases.statistics.*;
import s3.project.springbootbackend.persistence.Entities.Statistics;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

    public List<Statistics> getStats(){
       List<Long> stats =  new ArrayList<>();
       List<Object> responseList = new ArrayList<>();
       List<Statistics> statisticsList = new ArrayList<>();
        responseList.add(getTruckStatisticsUseCase.getTrucksStatistics());
       stats.add(approvedOrdersUseCase.getAllApprovedOrders(true));
       stats.add(getNotApprovedOrdersUseCase.getAllNotApprovedOrdersCount(false));
       stats.add(getCountOfCustomersUseCase.getCountOfCustomers());
       stats.add(getCountOfEmployeesUseCase.getCountOfEmployees());
       stats.add(getCountOfOrdersCurrentDateUseCase.getOrdersCount(new Date()));
       stats.add(getCountOfOrdersBeforeCurrentDateUseCase.getOrdersCount(new Date()));
       stats.add(getCountOfOrdersAfterCurrentDateUseCase.getOrdersCount(new Date()));
//       for(int i =0; i < responseList.size(); i++){
//           Statistics statistics = Statistics.builder().build();
//           statistics.setCategory(responseList.get(0) +"");
//           statistics.setValue((List<Long>) responseList.get(1));
//           Stream.of((responseList.get(1))).collect(Collectors.toList());
//           statisticsList.add(statistics);
////                   .value(responseList[1]).build();
//
//       }
        responseList.forEach(response ->{
//            Statistics statistics = Statistics.builder().category(responseList.get(0)+"").value(Stream.of(responseList.get(1)).collect(Collectors.toList())).build();
        });
//       for (long stat : stats ){
//           Statistics dto = new Statistics();
//           dto.setValue(stat[0] + "");
//       }
       return statisticsList;
    }
}

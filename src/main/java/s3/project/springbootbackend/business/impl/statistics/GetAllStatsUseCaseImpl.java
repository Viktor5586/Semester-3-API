package s3.project.springbootbackend.business.impl.statistics;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import s3.project.springbootbackend.business.useCases.statistics.*;
import s3.project.springbootbackend.domain.Responses.Statistics.GetStatisticsResponse;

import java.util.Date;

@Service
@AllArgsConstructor
public class GetAllStatsUseCaseImpl implements GetAllStatsUseCase {

    private GetTruckStatisticsUseCase getTruckStatisticsUseCase;
    private GetApprovedOrdersUseCase approvedOrdersUseCase;
    private GetNotApprovedOrdersUseCase getNotApprovedOrdersUseCase;
    private GetCountOfCustomersUseCase getCountOfCustomersUseCase;
    private GetCountOfEmployeesUseCase getCountOfEmployeesUseCase;
    private GetCountOfOrdersCurrentDateUseCase getCountOfOrdersCurrentDateUseCase;
    private GetCountOfOrdersBeforeCurrentDateUseCase getCountOfOrdersBeforeCurrentDateUseCase;
    private GetCountOfOrdersAfterCurrentDateUseCase getCountOfOrdersAfterCurrentDateUseCase;

    public GetStatisticsResponse getStats(){
        GetStatisticsResponse response = GetStatisticsResponse.builder()
                .trucks(getTruckStatisticsUseCase.getTrucksStatistics())
                .approved(approvedOrdersUseCase.getAllApprovedOrders(true))
                .notApproved(getNotApprovedOrdersUseCase.getAllNotApprovedOrdersCount(false))
                .customers(getCountOfCustomersUseCase.getCountOfCustomers())
                .employees(getCountOfEmployeesUseCase.getCountOfEmployees())
                .ordersToday(getCountOfOrdersCurrentDateUseCase.getOrdersCount(new Date()))
                .ordersBefore(getCountOfOrdersBeforeCurrentDateUseCase.getOrdersCount(new Date()))
                .ordersAfter(getCountOfOrdersAfterCurrentDateUseCase.getOrdersCount(new Date()))
                .build();
        return response;
    }
}

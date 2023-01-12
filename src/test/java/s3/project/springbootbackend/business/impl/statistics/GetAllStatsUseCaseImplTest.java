package s3.project.springbootbackend.business.impl.statistics;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import s3.project.springbootbackend.business.useCases.statistics.*;
import s3.project.springbootbackend.domain.Responses.Statistics.GetStatisticsResponse;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class GetAllStatsUseCaseImplTest {
    @Mock
    private GetTruckStatisticsUseCase getTruckStatisticsUseCase;
    @Mock
    private GetApprovedOrdersUseCase approvedOrdersUseCase;
    @Mock
    private GetNotApprovedOrdersUseCase getNotApprovedOrdersUseCase;
    @Mock
    private GetCountOfCustomersUseCase getCountOfCustomersUseCase;
    @Mock
    private GetCountOfEmployeesUseCase getCountOfEmployeesUseCase;
    @Mock
    private GetCountOfOrdersCurrentDateUseCase getCountOfOrdersCurrentDateUseCase;
    @Mock
    private GetCountOfOrdersBeforeCurrentDateUseCase getCountOfOrdersBeforeCurrentDateUseCase;
    @Mock
    private GetCountOfOrdersAfterCurrentDateUseCase getCountOfOrdersAfterCurrentDateUseCase;
//    @Mock
//    private CargoRepository cargoRepository;
    @InjectMocks
GetAllStatsUseCaseImpl getAllStatsUseCaseImpl;

    @Test
    void getStats_successful() {
        when(getTruckStatisticsUseCase.getTrucksStatistics()).thenReturn(1L);
        when(approvedOrdersUseCase.getAllApprovedOrders(true)).thenReturn(1L);
        when(getNotApprovedOrdersUseCase.getAllNotApprovedOrdersCount(false)).thenReturn(1L);
        when(getCountOfCustomersUseCase.getCountOfCustomers()).thenReturn(1L);
        when(getCountOfEmployeesUseCase.getCountOfEmployees()).thenReturn(1L);

        // there is problem if I specify the date because the method is run 1 sec later
        // and it says that I have invoked wrong parameter
        // that is why I have put any() instead of particular date
        when(getCountOfOrdersCurrentDateUseCase.getOrdersCount(any())).thenReturn(1L);
        when(getCountOfOrdersBeforeCurrentDateUseCase.getOrdersCount(any())).thenReturn(1L);
        when(getCountOfOrdersAfterCurrentDateUseCase.getOrdersCount(any())).thenReturn(1L);

        GetStatisticsResponse actual = getAllStatsUseCaseImpl.getStats();
        GetStatisticsResponse expected = GetStatisticsResponse.builder()
                .trucks(1L)
                .approved(1L)
                .notApproved(1L)
                .customers(1L)
                .employees(1L)
                .ordersToday(1L)
                .ordersBefore(1L)
                .ordersAfter(1L)
                .build();
        assertEquals(expected, actual);
    }
}
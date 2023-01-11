package s3.project.springbootbackend.business.impl.statistics;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import s3.project.springbootbackend.business.useCases.statistics.*;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class GetAllStatsTest {
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
    GetAllStats getAllStats;

    @Test
    void getStats_successful() {
        when(getTruckStatisticsUseCase.getTrucksStatistics()).thenReturn(1L);
        when(approvedOrdersUseCase.getAllApprovedOrders(true)).thenReturn(1L);
        when(getNotApprovedOrdersUseCase.getAllNotApprovedOrdersCount(false)).thenReturn(1L);
        when(getCountOfCustomersUseCase.getCountOfCustomers()).thenReturn(1L);
        when(getCountOfEmployeesUseCase.getCountOfEmployees()).thenReturn(1L);

        // there is problem if I specify the date because the method is run 1 sec later and it says that I have invoked wrong parameter
        when(getCountOfOrdersCurrentDateUseCase.getOrdersCount(any())).thenReturn(1L);
        when(getCountOfOrdersBeforeCurrentDateUseCase.getOrdersCount(any())).thenReturn(1L);
        when(getCountOfOrdersAfterCurrentDateUseCase.getOrdersCount(any())).thenReturn(1L);

        List<Long> actual = getAllStats.getStats();
        List<Long> expected = List.of(1L,1L,1L,1L,1L,1L,1L,1L);
        assertEquals(expected, actual);
    }
}
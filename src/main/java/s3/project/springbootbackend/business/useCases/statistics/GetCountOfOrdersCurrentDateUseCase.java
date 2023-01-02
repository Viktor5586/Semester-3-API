package s3.project.springbootbackend.business.useCases.statistics;

import java.util.Date;

public interface GetCountOfOrdersCurrentDateUseCase {
    long getOrdersCount(Date date);
}

package s3.project.springbootbackend.business.useCases.statistics;
import java.util.Date;

public interface GetCountOfOrdersBeforeCurrentDateUseCase {
    long getOrdersCount(Date date);
}

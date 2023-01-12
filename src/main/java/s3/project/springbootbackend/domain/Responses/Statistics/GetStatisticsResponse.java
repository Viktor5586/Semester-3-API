package s3.project.springbootbackend.domain.Responses.Statistics;

import lombok.Builder;
import lombok.Data;
import s3.project.springbootbackend.configuration.Generated;


@Data
@Builder
@Generated
public class GetStatisticsResponse {
    private Long trucks;
    private Long approved;
    private Long notApproved;
    private Long customers;
    private Long employees;
    private Long ordersToday;
    private Long ordersBefore;
    private Long ordersAfter;

}

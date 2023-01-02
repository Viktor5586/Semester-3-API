package s3.project.springbootbackend.domain.Responses.Statistics;

import lombok.Builder;
import lombok.Data;
import s3.project.springbootbackend.configuration.Generated;

import java.util.List;

@Data
@Builder
@Generated
public class GetStatisticsResponse {
    private List<Long> statistics;
//    private final long approvedOrder;
//    private final long disapprovedOrder;

}

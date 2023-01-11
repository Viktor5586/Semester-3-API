package s3.project.springbootbackend.business.useCases.statistics;


import java.util.List;

public interface GetAllStatsUseCase {
    List<Long> getStats();
}

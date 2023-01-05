package s3.project.springbootbackend.business.useCases.statistics;

import s3.project.springbootbackend.persistence.Entities.Statistics;

import java.util.List;

public interface GetAllStatsUseCase {
    List<Statistics> getStats();
}

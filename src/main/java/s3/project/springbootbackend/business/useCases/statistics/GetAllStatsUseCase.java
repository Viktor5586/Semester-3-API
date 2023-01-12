package s3.project.springbootbackend.business.useCases.statistics;


import s3.project.springbootbackend.domain.Responses.Statistics.GetStatisticsResponse;


public interface GetAllStatsUseCase {
    GetStatisticsResponse getStats();
}

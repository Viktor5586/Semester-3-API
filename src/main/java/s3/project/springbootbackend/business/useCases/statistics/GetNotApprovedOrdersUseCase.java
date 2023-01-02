package s3.project.springbootbackend.business.useCases.statistics;

public interface GetNotApprovedOrdersUseCase {
    long getAllNotApprovedOrdersCount(boolean notApproved);
}

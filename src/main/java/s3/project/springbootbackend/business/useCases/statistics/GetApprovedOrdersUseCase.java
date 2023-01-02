package s3.project.springbootbackend.business.useCases.statistics;

public interface GetApprovedOrdersUseCase {
    long getAllApprovedOrders(boolean approved);
}

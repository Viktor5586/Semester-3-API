package s3.project.springbootbackend.business.useCases.statistics;

public interface GetApprovedOrdersUseCase {
    int getAllApprovedOrders(boolean approved);
}

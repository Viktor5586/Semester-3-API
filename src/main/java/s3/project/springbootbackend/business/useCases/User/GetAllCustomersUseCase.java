package s3.project.springbootbackend.business.useCases.User;

import s3.project.springbootbackend.domain.Responses.Customer.GetAllUsersResponse;

public interface GetAllCustomersUseCase {
    GetAllUsersResponse getAllUsers();

}

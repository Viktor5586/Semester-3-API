package s3.project.springbootbackend.business.useCases.User;

import s3.project.springbootbackend.domain.Entities.Customer;
import s3.project.springbootbackend.domain.Requests.GetCusomerByIdRequest;
import s3.project.springbootbackend.domain.Responses.GetAllCustomersResponse;
import s3.project.springbootbackend.domain.Responses.GetCustomerByIdResponse;
import s3.project.springbootbackend.persistence.Entities.CustomerEntity;

import java.util.Optional;

public interface GetCustomerUseCase {
    Optional<Customer> getUser(long id);
}

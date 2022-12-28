package s3.project.springbootbackend.business.useCases.User;

import s3.project.springbootbackend.domain.Entities.Customer;

import java.util.Optional;

public interface GetCustomerUseCase {
    Optional<Customer> getUser(long id);
}

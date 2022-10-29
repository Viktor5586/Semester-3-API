package s3.project.springbootbackend.business.impl.User;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import s3.project.springbootbackend.business.impl.Converters.CustomerConverter;
import s3.project.springbootbackend.business.useCases.User.GetCustomerUseCase;
import s3.project.springbootbackend.domain.Entities.Customer;
import s3.project.springbootbackend.persistence.repositories.CustomerRepository;

import java.util.Optional;

@Service
@AllArgsConstructor
public class GetCustomerUseCaseImpl implements GetCustomerUseCase {
    private CustomerRepository customerRepository;

    @Override
    public Optional<Customer> getUser(long id) {
        return customerRepository.findById(id).map(CustomerConverter::convert);
    }
}

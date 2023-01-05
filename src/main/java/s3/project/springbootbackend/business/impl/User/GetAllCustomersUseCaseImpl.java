package s3.project.springbootbackend.business.impl.User;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import s3.project.springbootbackend.business.impl.Converters.CustomerConverter;
import s3.project.springbootbackend.business.useCases.User.GetAllCustomersUseCase;
import s3.project.springbootbackend.domain.Responses.Customer.GetAllUsersResponse;
import s3.project.springbootbackend.domain.Entities.Customer;
import s3.project.springbootbackend.persistence.Entities.CustomerEntity;
import s3.project.springbootbackend.persistence.repositories.CustomerRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class GetAllCustomersUseCaseImpl implements GetAllCustomersUseCase {

    private CustomerRepository customerRepository;

    @Override
        public GetAllUsersResponse getAllUsers() {
        List<CustomerEntity> users = customerRepository.findAll() ;
        GetAllUsersResponse response = new GetAllUsersResponse();
        List<Customer> students = users
                .stream()
                .map(CustomerConverter::convert)
                .toList();
        response.setAllUserEntities(users);

        return response;
    }
}

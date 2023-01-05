package s3.project.springbootbackend.business.impl.User;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import s3.project.springbootbackend.business.exeptions.UnauthorizedDataAccessException;
import s3.project.springbootbackend.business.impl.Converters.CustomerConverter;
import s3.project.springbootbackend.business.useCases.User.GetCustomerUseCase;
import s3.project.springbootbackend.domain.AccessToken;
import s3.project.springbootbackend.domain.Entities.Customer;
import s3.project.springbootbackend.persistence.Entities.RoleEnum;
import s3.project.springbootbackend.persistence.repositories.CustomerRepository;

import java.util.Optional;

@Service
@AllArgsConstructor
public class GetCustomerUseCaseImpl implements GetCustomerUseCase {
    private CustomerRepository customerRepository;
    private AccessToken requestAccessToken;

    @Override
    public Optional<Customer> getUser(long id) {
        try {
            if (!requestAccessToken.hasRole(RoleEnum.EMPLOYEE.name())) {
                if (! (requestAccessToken.getCustomerId().equals(requestAccessToken.getCustomerId()))){
                    throw new UnauthorizedDataAccessException("CUSTOMER_ID_NOT_FROM_LOGGED_IN_USER");
                }
            }
        }catch (Exception e){
            throw new UnauthorizedDataAccessException("CUSTOMER_ID_NOT_FROM_LOGGED_IN_USER");
        }

        return customerRepository.findById(id).map(CustomerConverter::convert);
    }
}

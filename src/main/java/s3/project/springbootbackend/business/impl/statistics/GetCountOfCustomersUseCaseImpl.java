package s3.project.springbootbackend.business.impl.statistics;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import s3.project.springbootbackend.business.useCases.statistics.GetCountOfCustomersUseCase;
import s3.project.springbootbackend.persistence.repositories.CustomerRepository;

@Service
@AllArgsConstructor
public class GetCountOfCustomersUseCaseImpl implements GetCountOfCustomersUseCase {
//    private UserRepository userRepository;
    private CustomerRepository customerRepository;

    @Override
    public long getCountOfCustomers() {
//        return userRepository.countAllByUserRoles(RoleEnum.CUSTOMER);
    return customerRepository.count();
    }
}

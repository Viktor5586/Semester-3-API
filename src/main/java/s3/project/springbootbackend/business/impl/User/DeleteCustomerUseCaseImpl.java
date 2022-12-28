package s3.project.springbootbackend.business.impl.User;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import s3.project.springbootbackend.business.useCases.User.DeleteCustomerUseCase;
import s3.project.springbootbackend.domain.Requests.Customer.DeleteCustomerByIdRequest;
import s3.project.springbootbackend.persistence.repositories.CargoRepository;
import s3.project.springbootbackend.persistence.repositories.CustomerRepository;

import javax.transaction.Transactional;

@Service
@AllArgsConstructor
public class DeleteCustomerUseCaseImpl implements DeleteCustomerUseCase {
    private final CustomerRepository customerRepository;
    private CargoRepository cargoRepository;
    @Override
    @Transactional
    public void delete(DeleteCustomerByIdRequest request) {
        cargoRepository.deleteAllByCustomerId(request.getCustomerId());
        customerRepository.deleteById(request.getCustomerId());
    }
}

package s3.project.springbootbackend.business.impl.User;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import s3.project.springbootbackend.business.useCases.User.DeleteCustomerUseCase;
import s3.project.springbootbackend.domain.Requests.DeleteCustomerByIdRequest;
import s3.project.springbootbackend.persistence.Entities.UserEntity;
import s3.project.springbootbackend.persistence.repositories.CargoRepository;
import s3.project.springbootbackend.persistence.repositories.CustomerRepository;
import s3.project.springbootbackend.persistence.repositories.UserRepository;

import javax.transaction.Transactional;

@Service
@AllArgsConstructor
public class DeleteCustomerUseCaseImpl implements DeleteCustomerUseCase {
    private CustomerRepository customerRepository;
    private UserRepository userRepository;
    private CargoRepository cargoRepository;
    @Override
    @Transactional
    public void delete(DeleteCustomerByIdRequest request) {
        UserEntity user = userRepository.findByCustomerIdOrEmployee_Id(request.getCustomerId());
        System.out.println(user.getId());
//        userRepository.deleteUserRole(user.getId());
//        userRepository.deleteByCustomer_IdOrEmployee_Id(request.getCustomerId());
//        cargoRepository.deleteAllByCustomerId(request.getCustomerId());
        customerRepository.deleteById(request.getCustomerId());
    }
}

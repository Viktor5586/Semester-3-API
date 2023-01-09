package s3.project.springbootbackend.business.impl.User;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import s3.project.springbootbackend.business.useCases.User.UpdateCustomerUseCase;
import s3.project.springbootbackend.domain.Requests.Customer.UpdateCustomerRequest;
import s3.project.springbootbackend.persistence.Entities.UserEntity;
import s3.project.springbootbackend.persistence.repositories.CustomerRepository;
import s3.project.springbootbackend.persistence.repositories.UserRepository;

@Service
@AllArgsConstructor
public class UpdateCustomerUseCaseImpl implements UpdateCustomerUseCase {
    private CustomerRepository customerRepository;
    private UserRepository userRepository;
    private PasswordEncoder passwordEncoder;
    @Override
    public ResponseEntity updateCustomer(UpdateCustomerRequest updateCustomerRequest) {
//        try {
            if (getOldPasswordFromRequestAndCompareWithDbOne(updateCustomerRequest.getId(),updateCustomerRequest.getOldPassword())){
                String encodedNewPassword = passwordEncoder.encode(updateCustomerRequest.getNewPassword());
                userRepository.updateUser(updateCustomerRequest.getUsername(), encodedNewPassword, updateCustomerRequest.getId());
                customerRepository.update(updateCustomerRequest.getFirstName(), updateCustomerRequest.getLastName(),updateCustomerRequest.getId());
                return ResponseEntity.ok().build();
//                throw new RuntimeException();
            }else {
                return ResponseEntity.badRequest().body("Check your password");
            }
//        }catch (Exception exception){
//            throw new RuntimeException(exception.getMessage());
//        }
    }

    private boolean getOldPasswordFromRequestAndCompareWithDbOne(Long id, String oldPassword){
        //try{
        System.out.println(userRepository.findByCustomerId(id));
            UserEntity user = userRepository.findByCustomerId(id);
            if(user != null){
                System.out.println("EncodedPassword: " + passwordEncoder.encode("1234"));
                String password = user.getPassword();
                if(passwordEncoder.matches(oldPassword, String.valueOf(password))) return true;
                //if(oldPassword.equals(String.valueOf(password)))return true;
                return false;
            }else {
                return false;
            }

        //}catch (Exception exception){
            //return false;
        //}

    }
}

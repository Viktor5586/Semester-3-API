package s3.project.springbootbackend.business.validations;

import lombok.AllArgsConstructor;
import s3.project.springbootbackend.business.exeptions.InvalidDataInRequest;
@AllArgsConstructor
public class ValidateCustomer {
    public static void validate(String password){
//        if(!validateEmail(request) && validatePassword(request)){
        if(!validatePassword(password)){
            throw new InvalidDataInRequest("INVALID_DATA");
        }
    }

//    private static boolean validateEmail(CreateCustomerRequest request){
//        if(repository.existsDistinctByUsername(request.getUsername())){
//            return false;
//        }else {
//            return true;
//        }
//    }

    private static boolean validatePassword(String password){
        if(password.length() <= 3){
            return false;
        }else {
            return true;
        }
    }
}

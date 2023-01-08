package s3.project.springbootbackend.business.validations;

import s3.project.springbootbackend.business.exeptions.InvalidDataInRequest;

public class ValidateEmployee {
//    static UserRepository repository;
    public static void validate(String password){
//        if(! (validateEmail(request) && validatePassword(request))){
        if(! validatePassword(password)){
            throw new InvalidDataInRequest("INVALID_DATA");
        }
    }

//    private static boolean validateEmail(CreateEmployeeRequest request){
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

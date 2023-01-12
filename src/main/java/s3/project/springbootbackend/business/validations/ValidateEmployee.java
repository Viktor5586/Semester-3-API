package s3.project.springbootbackend.business.validations;

import s3.project.springbootbackend.business.exeptions.InvalidDataInRequest;

public class ValidateEmployee {
    public static void validate(String password){
//        if(! (validateEmail(request) && validatePassword(request))){
        if(! validatePassword(password)){
            throw new InvalidDataInRequest("INVALID_DATA");
        }
    }
    private static boolean validatePassword(String password){
        if(password.length() <= 3){
            return false;
        }else {
            return true;
        }
    }
}

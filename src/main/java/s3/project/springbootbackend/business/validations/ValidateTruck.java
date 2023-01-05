package s3.project.springbootbackend.business.validations;

import s3.project.springbootbackend.business.exeptions.InvalidDataInRequest;
import s3.project.springbootbackend.domain.Requests.Truck.CreateTruckRequest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateTruck {

    public static void validate(CreateTruckRequest request){
        if(!(validateLicencePlate(request) && validateLocation(request))) {
            throw new InvalidDataInRequest("INVALID_DATA");
        }
    }

    private static boolean validateLicencePlate(CreateTruckRequest request){
        Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(request.getLicencePlate());
//        boolean b = m.find();
        if(!m.find()){
            return true;
        }else {
            return false;
        }
    }

    private static boolean validateLocation(CreateTruckRequest request){
        Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(request.getLocation());
//        boolean b = m.find();
        if(!m.find()){
            return true;
        }else {
            return false;
        }
    }
}

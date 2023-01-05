package s3.project.springbootbackend.business.exeptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class InvalidDataInRequest extends ResponseStatusException {

    public InvalidDataInRequest(String errorCode) {
        super(HttpStatus.BAD_REQUEST, errorCode);
    }
}

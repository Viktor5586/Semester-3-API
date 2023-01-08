package s3.project.springbootbackend.business.validations;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import s3.project.springbootbackend.business.exeptions.InvalidDataInRequest;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ValidateCustomerTest {

    @Test
    void validate_shouldThrowInvalidDataException() {
        try{
            ValidateCustomer.validate("AAA");

        }catch (InvalidDataInRequest ex){
            assertEquals(ex.getReason(), "INVALID_DATA");
        }
    }
}
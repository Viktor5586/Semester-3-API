package s3.project.springbootbackend.business.exeptions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class InvalidDataInRequestTest {
    @Test
    public void testInvalidDataInRequest() {
        InvalidDataInRequest exception = new InvalidDataInRequest("INVALID_DATA");
        assertEquals(HttpStatus.BAD_REQUEST, exception.getStatus());
        assertEquals("INVALID_DATA", exception.getReason());
    }

}
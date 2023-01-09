package s3.project.springbootbackend.business.exeptions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class InvalidAccessTokenExceptionTest {
    @Test
    public void testInvalidAccessTokenExceptionTest(){
        InvalidAccessTokenException exceptionTest = new InvalidAccessTokenException("INVALID_ACCESS_TOKEN");
        assertEquals(HttpStatus.UNAUTHORIZED, exceptionTest.getStatus());
        assertEquals("INVALID_ACCESS_TOKEN", exceptionTest.getReason());
    }

}
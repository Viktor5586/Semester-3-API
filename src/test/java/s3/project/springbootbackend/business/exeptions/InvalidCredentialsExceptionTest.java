package s3.project.springbootbackend.business.exeptions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class InvalidCredentialsExceptionTest {
    @Test
    public void testInvalidCredentialsException() {
        InvalidCredentialsException exception = new InvalidCredentialsException();
        assertEquals(HttpStatus.BAD_REQUEST, exception.getStatus());
        assertEquals("INVALID_CREDENTIALS", exception.getReason());
    }
}
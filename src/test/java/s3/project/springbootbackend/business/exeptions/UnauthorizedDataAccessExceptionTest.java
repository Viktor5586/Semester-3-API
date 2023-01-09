package s3.project.springbootbackend.business.exeptions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class UnauthorizedDataAccessExceptionTest {
    @Test
    public void testUnauthorizedDataAccessException() {
        UnauthorizedDataAccessException exception = new UnauthorizedDataAccessException("ACCESS_DENIED");
        assertEquals(HttpStatus.FORBIDDEN, exception.getStatus());
        assertEquals("ACCESS_DENIED", exception.getReason());
    }

}
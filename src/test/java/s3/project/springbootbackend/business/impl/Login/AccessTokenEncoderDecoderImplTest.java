package s3.project.springbootbackend.business.impl.Login;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import s3.project.springbootbackend.business.exeptions.InvalidAccessTokenException;
import s3.project.springbootbackend.domain.AccessToken;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class AccessTokenEncoderDecoderImplTest {
    @InjectMocks
    AccessTokenEncoderDecoderImpl accessTokenEncoderDecoder
            = new AccessTokenEncoderDecoderImpl("E91E158E4C6656F68B1B5D1C316766DE98D2AD6EF3BFB44F78E9CFCDF5");
    @Test
    void encodeDecode_successful() {
        AccessToken accessToken = AccessToken.builder()
                .subject("test@test.com")
                .roles(List.of("CUSTOMER"))
                .customerId(1L)
                .build();

        String tokenEncoded = accessTokenEncoderDecoder.encode(accessToken);
        AccessToken decodedToken = accessTokenEncoderDecoder.decode(tokenEncoded);

        assertEquals(accessToken.getCustomerId(), decodedToken.getCustomerId());
        assertEquals(accessToken.getSubject(), decodedToken.getSubject());
        assertEquals(accessToken.getRoles(), decodedToken.getRoles());
    }

    @Test
    public void encodeDecode_shouldThrowInvalidAccessTokenException(){
        try{
            accessTokenEncoderDecoder.decode("invalid_token");
        }catch (InvalidAccessTokenException exception){
            assertEquals(exception.getStatus(), HttpStatus.UNAUTHORIZED);
        }
    }
}
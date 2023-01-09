package s3.project.springbootbackend.business.impl.Login;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import s3.project.springbootbackend.domain.AccessToken;
import s3.project.springbootbackend.persistence.Entities.RoleEnum;
import s3.project.springbootbackend.persistence.Entities.UserRoleEntity;

import java.security.Key;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class AccessTokenEncoderDecoderImplTest {
    @Mock
    private Key key;
    @InjectMocks
    AccessTokenEncoderDecoderImpl accessTokenEncoderDecoder;
//    @Test
//    void encode_successful() {
//        when(key.)
//        String actual = accessTokenEncoderDecoder.encode(AccessToken.builder().subject("Test").roles(List.of("EMPLOYEE"))
//                .username("test@test.com").customerId(null).employeeId(1L).build());
//
//        System.out.println(actual);

//    }

//    @Test
//    void decode() {
//    }
}
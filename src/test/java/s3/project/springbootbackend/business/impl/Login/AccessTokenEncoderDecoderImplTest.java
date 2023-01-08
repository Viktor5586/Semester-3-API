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
@ExtendWith(MockitoExtension.class)
class AccessTokenEncoderDecoderImplTest {
//    @Mock
//    private Key key;
//    @InjectMocks
//    AccessTokenEncoderDecoderImpl accessTokenEncoderDecoder;
//    @Test
//    void encode_successful() {
//        List<String> role = RoleEnum.EMPLOYEE.stream;
//        AccessToken accessToken = AccessToken.builder().subject("Sth").roles(Set.of(UserRoleEntity.builder().role(RoleEnum.EMPLOYEE))).build();
//    }
//
//    @Test
//    void decode() {
//    }
}
package s3.project.springbootbackend.business.impl.Login;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import s3.project.springbootbackend.business.exeptions.InvalidCredentialsException;
import s3.project.springbootbackend.business.useCases.LogIn.AccessTokenEncoder;
import s3.project.springbootbackend.domain.AccessToken;
import s3.project.springbootbackend.domain.Requests.LogIn.LogInRequest;
import s3.project.springbootbackend.domain.Responses.LogInResponse;
import s3.project.springbootbackend.persistence.Entities.CustomerEntity;
import s3.project.springbootbackend.persistence.Entities.RoleEnum;
import s3.project.springbootbackend.persistence.Entities.UserEntity;
import s3.project.springbootbackend.persistence.Entities.UserRoleEntity;
import s3.project.springbootbackend.persistence.repositories.UserRepository;

import java.util.Collections;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
@ExtendWith(MockitoExtension.class)
class LogInUseCaseImplTest {
    @Mock
    private UserRepository userRepository;
    @Mock
    private PasswordEncoder passwordEncoder;
    @Mock
    private AccessTokenEncoder accessTokenEncoder;
    @InjectMocks
    private LogInUseCaseImpl logInUseCase;

    @Test
    void login_successful() {
        CustomerEntity customer = CustomerEntity.builder().id(1L).firstName("Test").lastName("Testing").build();
        UserEntity user = UserEntity.builder().id(2L).username("test@test.com").password("1234").customer(customer).build();
        UserEntity newUser = UserEntity.builder()
                .id(2L)
                .username("test@test.com")
                .password("encoded")
                .customer(customer)
                .userRoles(Set.of(UserRoleEntity.builder().id(3L)
                .role(RoleEnum.CUSTOMER)
                .user(user).build()))
                .build();
        when(userRepository.findByUsername("test@test.com"))
                .thenReturn(newUser);
        when(passwordEncoder.matches("1234", "encoded"))
                .thenReturn(true);
        when(accessTokenEncoder.encode(AccessToken.builder()
                .subject(newUser.getUsername())
                .roles(Collections.singletonList("CUSTOMER"))
                .customerId(newUser.getCustomer().getId())
                .employeeId(null)
                .build()))
                .thenReturn("Test token");

        LogInResponse actualResult = logInUseCase.login(LogInRequest.builder()
                .username("test@test.com")
                .password("1234")
                .build());

        LogInResponse expectedResult = LogInResponse.builder()
                .accessToken("Test token")
                .build();

        assertEquals(expectedResult, actualResult);
        verify(userRepository).findByUsername("test@test.com");
        verify(passwordEncoder).matches("1234", "encoded");
        verify(accessTokenEncoder).encode(AccessToken.builder()
                .subject(newUser.getUsername())
                .roles(Collections.singletonList("CUSTOMER"))
                .customerId(newUser.getCustomer().getId())
                .employeeId(null)
                .build());
    }
    @Test
    void login_shouldThrowInvalidCredentialsException() {
        try {
            CustomerEntity customer = CustomerEntity.builder().id(1L).firstName("Test").lastName("Testing").build();
            UserEntity user = UserEntity.builder().id(2L).username("test@test.com").password("1234").customer(customer).build();
            UserEntity newUser = UserEntity.builder()
                    .id(2L)
                    .username("test@test.com")
                    .password("encoded")
                    .customer(customer)
                    .userRoles(Set.of(UserRoleEntity.builder().id(3L)
                            .role(RoleEnum.CUSTOMER)
                            .user(user).build()))
                    .build();
            when(userRepository.findByUsername("test@test.com"))
                    .thenReturn(null);
            logInUseCase.login(LogInRequest.builder()
                    .username("test@test.com")
                    .password("1234")
                    .build());
        }catch (InvalidCredentialsException exception){
            assertEquals(HttpStatus.BAD_REQUEST,exception.getStatus());
            assertEquals("INVALID_CREDENTIALS", exception.getReason());
        }
    }
}
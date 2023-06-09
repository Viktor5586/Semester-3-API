package s3.project.springbootbackend.business.impl.Login;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import s3.project.springbootbackend.business.exeptions.InvalidCredentialsException;
import s3.project.springbootbackend.business.useCases.LogIn.AccessTokenEncoder;
import s3.project.springbootbackend.business.useCases.LogIn.LogInUseCase;
import s3.project.springbootbackend.domain.AccessToken;
import s3.project.springbootbackend.domain.Requests.LogIn.LogInRequest;
import s3.project.springbootbackend.domain.Responses.LogInResponse;
import s3.project.springbootbackend.persistence.Entities.UserEntity;
import s3.project.springbootbackend.persistence.repositories.UserRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LogInUseCaseImpl implements LogInUseCase {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final AccessTokenEncoder accessTokenEncoder;
    @Override
    public LogInResponse login(LogInRequest loginRequest) {
        try{
            UserEntity user = userRepository.findByUsername(loginRequest.getUsername());
            if (user == null) {
                throw new InvalidCredentialsException();
            }

            if (!matchesPassword(loginRequest.getPassword(), user.getPassword())) {
                throw new InvalidCredentialsException();
            }

            String accessToken = generateAccessToken(user);
            return LogInResponse.builder().accessToken(accessToken).build();
        }catch (InvalidCredentialsException exception){
            throw (exception);
        }


    }

    private boolean matchesPassword(String rawPassword, String encodedPassword) {
        return passwordEncoder.matches(rawPassword, encodedPassword);
    }

    private String generateAccessToken(UserEntity user) {
        Long customerId = user.getCustomer() != null ? user.getCustomer().getId() : null;
        List<String> roles = user.getUserRoles().stream()
                .map(userRole -> userRole.getRole().toString())
                .toList();

        return accessTokenEncoder.encode(
                AccessToken.builder()
                        .subject(user.getUsername())
                        .roles(roles)
                        .customerId(customerId)
                        .build());
    }
}

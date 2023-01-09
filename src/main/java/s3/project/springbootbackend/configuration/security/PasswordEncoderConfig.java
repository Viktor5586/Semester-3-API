package s3.project.springbootbackend.configuration.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import s3.project.springbootbackend.configuration.Generated;

@Configuration
@Generated
public class PasswordEncoderConfig {
    @Bean
    public PasswordEncoder createBCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
}

package s3.project.springbootbackend.business.useCases.LogIn;

import s3.project.springbootbackend.domain.AccessToken;

public interface AccessTokenDecoder {
    AccessToken decode(String accessTokenEncoded);
}

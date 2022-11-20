package s3.project.springbootbackend.business.useCases;

import s3.project.springbootbackend.domain.AccessToken;

public interface AccessTokenDecoder {
    AccessToken decode(String accessTokenEncoded);
}

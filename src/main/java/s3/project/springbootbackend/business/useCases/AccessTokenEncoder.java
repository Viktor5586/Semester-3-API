package s3.project.springbootbackend.business.useCases;

import s3.project.springbootbackend.domain.AccessToken;

public interface AccessTokenEncoder {
    String encode(AccessToken accessToken);
}

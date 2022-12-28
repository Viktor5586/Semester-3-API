package s3.project.springbootbackend.business.useCases.LogIn;

import s3.project.springbootbackend.domain.AccessToken;

public interface AccessTokenEncoder {
    String encode(AccessToken accessToken);
}

package s3.project.springbootbackend.domain.Responses.Cargo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import s3.project.springbootbackend.configuration.Generated;
import s3.project.springbootbackend.persistence.Entities.CargoEntity;

@Builder
@Setter
@Getter
@Generated
public class GetCargoResponse {
    private CargoEntity cargoEntity;
}

package s3.project.springbootbackend.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import s3.project.springbootbackend.persistence.Entities.CargoEntity;

@Builder
@Setter
@Getter
public class GetCargoResponse {
    private CargoEntity cargoEntity;
}

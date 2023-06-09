package s3.project.springbootbackend.business.impl.Converters;

import s3.project.springbootbackend.domain.Entities.Cargo;
import s3.project.springbootbackend.persistence.Entities.CargoEntity;

public class CargoConverter {
    public static Cargo convert(CargoEntity cargo){
        return Cargo.builder()
                .id(cargo.getId())
                .height(cargo.getHeight())
                .length(cargo.getLength())
                .width(cargo.getWidth())
                .weight(cargo.getWeight())
                .approved(cargo.isApproved())
                .customerId(cargo.getCustomerId())
                .startPoint(cargo.getStartPoint())
                .endPoint(cargo.getEndPoint())
                .date(cargo.getDate())
                .build();
    }
}

package s3.project.springbootbackend.business.impl.Converters;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import s3.project.springbootbackend.domain.Entities.Cargo;
import s3.project.springbootbackend.persistence.Entities.CargoEntity;

import java.util.Date;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@ExtendWith(MockitoExtension.class)
class CargoConverterTest {

    @Test
    void convert_success() {
        CargoEntity cargoEntity = CargoEntity.builder().id(1L).height(2).width(3).length(4).weight(5).approved(true)
                .customerId(2L).startPoint("here").endPoint("there").date(new Date()).build();
        Cargo cargo = CargoConverter.convert(cargoEntity);

        assertThat(cargoEntity).usingRecursiveComparison().isEqualTo(cargo);
    }
}
package s3.project.springbootbackend.business.impl.Converters;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import s3.project.springbootbackend.domain.Entities.Customer;
import s3.project.springbootbackend.persistence.Entities.CustomerEntity;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
@ExtendWith(MockitoExtension.class)

class CustomerConverterTest {

    @Test
    void convert_success() {
        CustomerEntity customerEntity = CustomerEntity.builder().id(1L).firstName("test").lastName("testing").build();
        Customer customer = CustomerConverter.convert(customerEntity);

        assertThat(customerEntity).usingRecursiveComparison().isEqualTo(customer);
    }
}
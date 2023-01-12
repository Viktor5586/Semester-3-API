package s3.project.springbootbackend.business.impl.Converters;

import s3.project.springbootbackend.domain.Entities.Customer;
import s3.project.springbootbackend.persistence.Entities.CustomerEntity;

public class CustomerConverter {
    public static Customer convert(CustomerEntity user) {
        return Customer.builder()
                .id(user.getId())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .build();
    }
}

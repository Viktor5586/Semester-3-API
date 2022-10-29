package s3.project.springbootbackend.business.impl.Converters;

import s3.project.springbootbackend.domain.Entities.Customer;
import s3.project.springbootbackend.persistence.Entities_DTO.CustomerEntity;

public class CustomerConverter {
    public CustomerConverter() {
    }

    public static Customer convert(CustomerEntity user) {
        return Customer.builder()
                .id(user.getId())
                .username(user.getUsername())
                .password(user.getPassword())
                .build();
    }
}

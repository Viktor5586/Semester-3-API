package s3.project.springbootbackend.persistence.Entities;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

//@Builder
//@Getter
//@Setter
public class CustomerEntity extends UserEntity {
    private OrderEntity currentOrderEntity;
    private List<OrderEntity> pastOrderEntities;

    CustomerEntity(Long id, String username, String password) {
        super(id, username, password);
    }
}

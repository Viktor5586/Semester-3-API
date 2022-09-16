package s3.project.springbootbackend.persistence.Entities;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

//@Builder
@Getter
@Setter
public class Customer extends User {
    private Order currentOrder;
    private List<Order> pastOrders;

    Customer(String id, String username, String password) {
        super(id, username, password);
    }
}

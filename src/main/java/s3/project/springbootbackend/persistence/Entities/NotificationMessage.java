package s3.project.springbootbackend.persistence.Entities;

import lombok.Data;

@Data
public class NotificationMessage {
    private String id;
//    private String from;
//    private String to;
    private String text = "Order has been send";
}

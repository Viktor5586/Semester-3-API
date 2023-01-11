package s3.project.springbootbackend.controller;

import lombok.AllArgsConstructor;
import lombok.Generated;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import s3.project.springbootbackend.persistence.Entities.NotificationMessage;

@Generated
@RestController
@AllArgsConstructor
@RequestMapping("notifications")
public class NotificationsController {
    private final SimpMessagingTemplate messagingTemplate;

    @PostMapping
    public ResponseEntity<Void> sendNotificationToUsers(@RequestBody NotificationMessage message) {
        messagingTemplate.convertAndSend("/employee/employeeNotifications", message);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}

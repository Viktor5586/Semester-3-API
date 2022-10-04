package s3.project.springbootbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import s3.project.springbootbackend.controller.UserController;

import java.util.Collections;

@SpringBootApplication
public class SpringbootBackendApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(SpringbootBackendApplication.class);
		app.setDefaultProperties(Collections.singletonMap("server.port", "8080"));
		app.run(args);
		//SpringApplication.run(SpringbootBackendApplication.class, args);
	}

}

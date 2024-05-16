package ak.patel.piersquere;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Service to SignUp New user",
description = "Piersquere MicroService API Specification", version = "v1", 
contact = @Contact(name = "asit patel", email = "akp@piersquere.com", url = "http://localhost:8080/swagger-ui/index.html"),
license = @License(name = "legalHire", url = "3o days free trail")))
public class SwaggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerApplication.class, args);
	}

}

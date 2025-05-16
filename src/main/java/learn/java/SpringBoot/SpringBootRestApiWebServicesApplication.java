package learn.java.SpringBoot;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Spring CRUD Restful API",
				description = "Spring CRUD Restful API",
				version = "v1.0",
				contact = @Contact(
						name = "Rohit",
						email = "gg@gmail.com",
						url = "website.com"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://learn.java/license"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Spring boot user management documentation",
				url = "https://learn.java/user-management.html"
		)
)
public class  SpringBootRestApiWebServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestApiWebServicesApplication.class, args);
	}

}

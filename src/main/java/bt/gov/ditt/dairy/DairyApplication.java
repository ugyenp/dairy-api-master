package bt.gov.ditt.dairy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import bt.gov.ditt.dairy.repository.UserRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
@EnableAutoConfiguration(exclude = { ErrorMvcAutoConfiguration.class })
public class DairyApplication {

	public static void main(String[] args) {
		SpringApplication.run(DairyApplication.class, args);
	}

}

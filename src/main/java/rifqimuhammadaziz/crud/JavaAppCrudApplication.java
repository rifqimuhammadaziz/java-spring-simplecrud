package rifqimuhammadaziz.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class JavaAppCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaAppCrudApplication.class, args);
	}

}

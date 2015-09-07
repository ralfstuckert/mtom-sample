package rst.sample.mtom.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		// needed for streaming, see https://java.net/jira/browse/SAAJ-31
		System.setProperty("saaj.use.mimepull", "true");
		
		SpringApplication.run(Application.class, args);
	}
}

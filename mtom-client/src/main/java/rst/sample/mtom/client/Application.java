
package rst.sample.mtom.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import rst.sample.mtom.client.ws.DocumentsClient;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Application {

	public static void main(final String[] args) throws Exception {
		final SpringApplication springApplication = new SpringApplication(Application.class);
		ApplicationContext ctx = springApplication.run();

		DocumentsClient documentsClient = ctx.getBean(DocumentsClient.class);
		documentsClient.storeDocument(1000);
	}

}

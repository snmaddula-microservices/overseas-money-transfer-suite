package snmaddula.remittance.limitservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import snmaddula.components.swaggerready.SwaggerReady;

/**
 * Remittance Limit Service Application
 * 
 * @author snmaddula
 *
 */
@SwaggerReady
@SpringBootApplication
public class LimitServiceApp {

	public static void main(String[] args) {
		SpringApplication.run(LimitServiceApp.class, args);
	}
}

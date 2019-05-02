package snmaddula.remittance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

/**
 * 
 * @author snmaddula
 *
 */
@EnableAdminServer
@EnableEurekaServer
@SpringBootApplication
public class NamingServerApp {

	public static void main(String[] args) {
		SpringApplication.run(NamingServerApp.class, args);
	}

}

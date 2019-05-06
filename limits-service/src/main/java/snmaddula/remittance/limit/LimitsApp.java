package snmaddula.remittance.limit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * The entry point class for Remittance Limit Service
 * 
 * @author snmaddula
 *
 */
@EnableHystrix
@EnableDiscoveryClient
@SpringBootApplication
public class LimitsApp {

	public static void main(String[] args) {
		SpringApplication.run(LimitsApp.class, args);
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}

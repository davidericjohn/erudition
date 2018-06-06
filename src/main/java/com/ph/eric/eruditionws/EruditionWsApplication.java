package com.ph.eric.eruditionws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * Ubiquitous Fortnight Web Service's servlet initializer
 * 
 * @author davidericjohn
 * @since 1.0.0
 */
@SpringBootApplication
@EnableJpaAuditing
public class EruditionWsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EruditionWsApplication.class, args);
	}

}

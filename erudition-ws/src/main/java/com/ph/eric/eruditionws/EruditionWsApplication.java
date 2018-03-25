package com.ph.eric.eruditionws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * Ubiquitous Fortnight Web Service's servlet initializer
 * 
 * @author davidericjohn
 * @since 1.0.0
 */
@SpringBootApplication
public class EruditionWsApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(EruditionWsApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(EruditionWsApplication.class);
	}

}

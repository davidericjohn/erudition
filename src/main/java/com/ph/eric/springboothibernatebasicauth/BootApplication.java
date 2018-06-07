package com.ph.eric.springboothibernatebasicauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * This class is responsible for doing all the configuration necessary to run
 * the application. The {@code SpringBootApplication} conveniently adds the
 * {@code Configuration, EnableAutoConfiguration, ComponentScan} annotations. It
 * also adds {@code EnableWebMvc} when spring-webmvc is on the classpath.
 * 
 * @author davidericjohn
 */
@SpringBootApplication
@EnableJpaAuditing
public class BootApplication {

	public static void main(String[] args) {
		// launch the spring boot application
		SpringApplication.run(BootApplication.class, args);
	}

}

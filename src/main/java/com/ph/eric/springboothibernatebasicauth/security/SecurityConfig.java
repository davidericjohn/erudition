package com.ph.eric.springboothibernatebasicauth.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Contains the security configuration of the application.
 * 
 * @author davidericjohn
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	public AuthenticationEntryPoint authEntryPoint;

	/**
	 * Contains logic on how to authenticate requests.
	 */
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable().authorizeRequests().anyRequest().fullyAuthenticated().and().httpBasic()
				.authenticationEntryPoint(this.authEntryPoint);
	}

}

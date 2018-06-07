package com.ph.eric.springboothibernatebasicauth.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;
import org.springframework.stereotype.Component;

/**
 * This class is used to authenticate request using BASIC authentication.
 * 
 * @author davidericjohn
 */
@Component
public class AuthenticationEntryPoint extends BasicAuthenticationEntryPoint {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.security.web.authentication.www.
	 * BasicAuthenticationEntryPoint#afterPropertiesSet()
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		setRealmName("Erudition-WS");
		super.afterPropertiesSet();
	}

	/**
	 * Contains logic when requests are no longer authorized.
	 */
	@Override
	public void commence(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException authException) throws IOException, ServletException {
		response.addHeader("WWW-Authenticate", "Basic realm=" + getRealmName());
		response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
	}

}

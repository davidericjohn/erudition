package com.ph.eric.springboothibernatebasicauth.controller;

import java.net.URI;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.ph.eric.springboothibernatebasicauth.model.User;
import com.ph.eric.springboothibernatebasicauth.service.RegisterService;

/**
 * This class maps all of the requests coming from the {@code DispatcherServlet}
 * that are related to registration services.
 * 
 * @author davidericjohn
 */
@RestController
@RequestMapping("/registers")
public class RegisterController {

	@Autowired
	private RegisterService service;

	/**
	 * Maps the request for storing the user data in the database.
	 * 
	 * @param user
	 *            model object containing the user data
	 * @return http response containing the status code, headers and body
	 */
	@PostMapping("/users")
	public ResponseEntity<Void> saveUser(@Valid @RequestBody final User user) {
		this.service.saveUser(user);
		final URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(user.getId())
				.toUri();

		return ResponseEntity.created(location).build();
	}

}

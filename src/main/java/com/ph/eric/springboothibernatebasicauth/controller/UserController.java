package com.ph.eric.springboothibernatebasicauth.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ph.eric.springboothibernatebasicauth.model.User;
import com.ph.eric.springboothibernatebasicauth.service.UserService;

/**
 * This class maps all of the requests coming from the {@code DispatcherServlet}
 * that are related to user services.
 * 
 * @author davidericjohn
 */
@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService service;

	/**
	 * Maps the request for querying all users in the database.
	 * 
	 * @return http response containing the status code, headers and user data
	 */
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		return ResponseEntity.ok(this.service.findAll());
	}
	
	/**
	 * Maps the request for querying user with the given ID
	 * 
	 * @param id
	 * @return http response containing the status code, headers and user data
	 */
	@GetMapping("/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id) {
		return ResponseEntity.ok(this.service.findById(id));
	}

	/**
	 * Maps the request for updating the user in the database.
	 * 
	 * @param id
	 *            user id
	 * @param user
	 *            model object containing the user data
	 * @return http response containing the status code, headers and body
	 */
	@PutMapping("/{id}")
	public ResponseEntity<Void> update(@PathVariable Long id, @Valid @RequestBody final User user) {
		this.service.update(id, user);

		return ResponseEntity.ok().build();
	}

	/**
	 * Maps the request for deleting the user in the database.
	 * 
	 * @param id
	 *            user id
	 * @param user
	 *            model object containing the user data
	 * @return http response containing the status code, headers and body
	 */
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		this.service.delete(id);

		return ResponseEntity.ok().build();
	}

}

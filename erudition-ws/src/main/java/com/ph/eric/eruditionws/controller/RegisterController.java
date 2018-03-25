package com.ph.eric.eruditionws.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.ph.eric.eruditionws.service.RegisterService;
import com.ph.eric.eruditionws.to.UserTO;

/**
 * 
 * @author davidericjohn
 */
@RestController
@RequestMapping("/registers")
public class RegisterController {
	
	@Autowired
	private RegisterService service;
	
	@PostMapping("/users")
	public ResponseEntity<Void> saveUser(@RequestBody UserTO user) {
		this.service.saveUser(user);
		
		final URI location = ServletUriComponentsBuilder.fromCurrentRequest().path(
				"/{id}").buildAndExpand(user.getId()).toUri();
		
		return ResponseEntity.created(location).build();
	}

}

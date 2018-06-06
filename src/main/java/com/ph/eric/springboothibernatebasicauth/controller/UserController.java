package com.ph.eric.springboothibernatebasicauth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ph.eric.springboothibernatebasicauth.model.User;
import com.ph.eric.springboothibernatebasicauth.service.UserService;

/**
 * 
 * @author davidericjohn
 * @since 1.0.0
 */
@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService service;
	
	@GetMapping
	private ResponseEntity<List<User>> findAll() {
		return ResponseEntity.ok(this.service.findAll());
	}

}

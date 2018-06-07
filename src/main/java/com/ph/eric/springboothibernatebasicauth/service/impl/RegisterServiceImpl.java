package com.ph.eric.springboothibernatebasicauth.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ph.eric.springboothibernatebasicauth.model.User;
import com.ph.eric.springboothibernatebasicauth.service.RegisterService;
import com.ph.eric.springboothibernatebasicauth.service.UserService;

/**
 * Implementation class of {@code RegisterService} which handles all
 * registration related transactions.
 * 
 * @author davidericjohn
 */
@Component
public class RegisterServiceImpl implements RegisterService {

	@Autowired
	private UserService userService;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void saveUser(final User user) {
		this.userService.save(user);
	}

}

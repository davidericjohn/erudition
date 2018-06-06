package com.ph.eric.springboothibernatebasicauth.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ph.eric.springboothibernatebasicauth.model.User;
import com.ph.eric.springboothibernatebasicauth.service.RegisterService;
import com.ph.eric.springboothibernatebasicauth.service.UserService;

/**
 * Registration Service implementation class
 * 
 * @author davidericjohn
 * @since 1.0.0
 */
@Component
public class RegisterServiceImpl implements RegisterService {
	
	@Autowired
	private UserService userService;

	/* (non-Javadoc)
	 * @see com.ph.eric.eruditionws.service.RegisterService#saveUser()
	 */
	@Override
	public void saveUser(final User user) {
		this.userService.save(user);
	}

}

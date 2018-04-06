package com.ph.eric.eruditionws.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ph.eric.eruditionws.service.RegisterService;
import com.ph.eric.eruditionws.service.UserService;
import com.ph.eric.eruditionws.to.UserTO;

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
	public void saveUser(final UserTO user) {
		this.userService.save(user);
	}

}

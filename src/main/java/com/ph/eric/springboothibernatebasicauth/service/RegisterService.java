package com.ph.eric.springboothibernatebasicauth.service;

import com.ph.eric.springboothibernatebasicauth.model.User;

/**
 * Registration Service
 * 
 * @author davidericjohn
 * @since 1.0.0
 */
public interface RegisterService {
	
	/**
	 * Saves user data
	 * 
	 * @param user
	 */
	public void saveUser(User user);

}

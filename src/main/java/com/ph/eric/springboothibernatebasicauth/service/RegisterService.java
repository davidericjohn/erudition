package com.ph.eric.springboothibernatebasicauth.service;

import com.ph.eric.springboothibernatebasicauth.model.User;

/**
 * Responsible for handling all registration transactions.
 * 
 * @author davidericjohn
 */
public interface RegisterService {

	/**
	 * Stores the user data in the database.
	 * 
	 * @param user
	 *            model object containing the user data
	 */
	public void saveUser(User user);

}

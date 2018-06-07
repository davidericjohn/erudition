package com.ph.eric.springboothibernatebasicauth.service;

import java.util.List;

import com.ph.eric.springboothibernatebasicauth.model.User;

/**
 * Responsible for handling all user related transactions.
 * 
 * @author davidericjohn
 */
public interface UserService {

	/**
	 * Returns all the user data from the database.
	 * 
	 * @return
	 */
	List<User> findAll();

	/**
	 * Returns the user data with the given user id.
	 * 
	 * @param id
	 *            user id
	 * @return model object containing the user data
	 */
	User findById(Long id);

	/**
	 * Stores the user data in the database.
	 * 
	 * @param user
	 *            model object containing the user data
	 * @return returns the model object back
	 */
	User save(User user);

	/**
	 * Updates the user data in the database.
	 * 
	 * @param id
	 *            user id
	 * @param user
	 *            model object containing the user data
	 * @return returns the model object back
	 */
	User update(Long id, User user);

	/**
	 * Deletes the user data from the database.
	 * 
	 * @param id
	 *            user id
	 */
	void delete(Long id);

}

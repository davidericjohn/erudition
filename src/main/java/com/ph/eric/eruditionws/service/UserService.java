package com.ph.eric.eruditionws.service;

import java.util.List;

import com.ph.eric.eruditionws.model.User;

/**
 * @author davidericjohn
 * @since 1.0.0
 */
public interface UserService {
	
	/**
	 * 
	 * @return
	 */
	List<User> findAll();
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	User findById(Long id);
	
	/**
	 * 
	 * @param user
	 * @return
	 */
	User save(User user);
	
	/**
	 * 
	 * @param id
	 * @param user
	 * @return
	 */
	User update(Long id, User user);
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	void delete(Long id);

}

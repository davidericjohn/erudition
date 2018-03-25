package com.ph.eric.eruditionws.service;

import java.util.List;

import com.ph.eric.eruditionws.to.UserTO;

/**
 * @author davidericjohn
 * @since 1.0.0
 */
public interface UserService {
	
	/**
	 * 
	 * @return
	 */
	public List<UserTO> getAll();
	
	/**
	 * 
	 * @param user
	 * @return
	 */
	public UserTO save(UserTO user);

}

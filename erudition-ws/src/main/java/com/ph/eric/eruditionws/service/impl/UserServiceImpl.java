package com.ph.eric.eruditionws.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ph.eric.eruditionws.dao.UserDao;
import com.ph.eric.eruditionws.service.UserService;
import com.ph.eric.eruditionws.to.UserTO;

/**
 * @author davidericjohn
 *
 */
@Component
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao dao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.ph.eric.eruditionws.service.UserService#getUserById(java.lang.
	 * Long)
	 */
	@Override
	public List<UserTO> getAll() {
		return this.dao.findAll();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ph.eric.eruditionws.service.UserService#save(com.ph.eric.
	 * ubiquitousfortnightws.to.UserTO)
	 */
	@Override
	public UserTO save(UserTO user) {
		return this.dao.save(user);
	}

}

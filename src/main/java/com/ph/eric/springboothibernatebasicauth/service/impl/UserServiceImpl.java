package com.ph.eric.springboothibernatebasicauth.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ph.eric.springboothibernatebasicauth.exception.ResourceNotFoundException;
import com.ph.eric.springboothibernatebasicauth.model.User;
import com.ph.eric.springboothibernatebasicauth.repository.UserRepository;
import com.ph.eric.springboothibernatebasicauth.service.UserService;

/**
 * @author davidericjohn
 *
 */
@Component
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;

	@Override
	public List<User> findAll() {
		return this.userRepo.findAll();
	}

	@Override
	public User findById(final Long id) {
		return this.userRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("User", "ID", id));
	}

	@Override
	public User save(final User user) {
		return this.userRepo.save(user);
	}

	@Override
	public User update(final Long id, final User user) {
		final User entity = this.userRepo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("User", "ID", id));

		entity.setFirstName(user.getFirstName());
		entity.setLastName(user.getLastName());
		entity.setEmail(user.getEmail());

		this.userRepo.save(entity);

		return entity;
	}

	@Override
	public void delete(Long id) {
		final User entity = this.userRepo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("User", "ID", id));

		this.userRepo.delete(entity);
	}

}

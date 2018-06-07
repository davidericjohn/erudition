package com.ph.eric.springboothibernatebasicauth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ph.eric.springboothibernatebasicauth.model.User;

/**
 * Handles the integration with the database for User entity.
 * 
 * @author davidericjohn
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}

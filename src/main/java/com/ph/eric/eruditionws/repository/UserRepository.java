package com.ph.eric.eruditionws.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ph.eric.eruditionws.model.User;

/**
 * @author davidericjohn
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
}

package com.ph.eric.eruditionws.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ph.eric.eruditionws.dao.UserDao;
import com.ph.eric.eruditionws.to.UserTO;

/**
 * @author davidericjohn
 */
@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;

	@Override
	@Transactional(readOnly = true)
	public List<UserTO> findAll() {
		return this.jdbcTemplate.query("select * from users", new UserRowMapper());
	}

	@Override
	@Transactional(readOnly = true)
	public UserTO findById(Long id) {
		final SqlParameterSource params = new MapSqlParameterSource("id", id);
		return this.jdbcTemplate.queryForObject("select * from users where id = :id", params, new UserRowMapper());
	}

	@Override
	@Transactional
	public UserTO save(UserTO entity) {
		final String sql = "insert into users (first_name, last_name, email) values (:firstName, :lastName, :email)";
		final Map<String, Object> params = new HashMap<String, Object>();
		
		params.put("firstName", entity.getFirstName());
		params.put("lastName", entity.getLastName());
		params.put("email", entity.getEmail());
		
		jdbcTemplate.update(sql, params);
		return entity;
	}

	private class UserRowMapper implements RowMapper<UserTO> {

		@Override
		public UserTO mapRow(ResultSet rs, int rowNum) throws SQLException {
			final UserTO user = new UserTO();
			user.setId(rs.getLong("id"));
			user.setFirstName(rs.getString("first_name"));
			user.setLastName(rs.getString("last_name"));
			user.setEmail(rs.getString("email"));

			return user;
		}

	}

}

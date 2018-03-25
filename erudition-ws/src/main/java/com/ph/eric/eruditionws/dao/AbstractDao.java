package com.ph.eric.eruditionws.dao;

import java.util.List;

import com.ph.eric.eruditionws.to.AbstractTO;

/**
 * 
 * @author davidericjohn
 *
 * @param <T>
 */
public interface AbstractDao<T extends AbstractTO> {
	
	/**
	 * 
	 * @return
	 */
	public List<T> findAll();
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public T findById(Long id);
	
	/**
	 * 
	 * @param entity
	 * @return
	 */
	public T save(T entity);

}

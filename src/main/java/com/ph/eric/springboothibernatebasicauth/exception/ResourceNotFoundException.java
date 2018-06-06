package com.ph.eric.springboothibernatebasicauth.exception;

/**
 * @author davidericjohn
 *
 */
public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -2235374753957905L;

	public ResourceNotFoundException(String resourceName, String fieldName, Object fieldValue) {
		super(String.format("%s not found with %s : '%s'", resourceName, fieldName, fieldValue));
	}
	
}

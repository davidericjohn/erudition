package com.ph.eric.eruditionws.to;

import java.io.Serializable;

/**
 * Abstract Transfer Object
 * 
 * @author davidericjohn
 * @since 1.0.0
 */
public class AbstractTO implements Serializable {

	private static final long serialVersionUID = -8783366364569947761L;

	private Long id;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(final Long id) {
		this.id = id;
	}

}

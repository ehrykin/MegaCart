package com.megacart.domain.catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_category_filter database table.
 * 
 */
@Entity
@Table(name="mc_category_filter")
@NamedQuery(name="McCategoryFilter.findAll", query="SELECT m FROM McCategoryFilter m")
public class McCategoryFilter implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private McCategoryFilterPK id;

	public McCategoryFilter() {
	}

	public McCategoryFilterPK getId() {
		return this.id;
	}

	public void setId(McCategoryFilterPK id) {
		this.id = id;
	}

}
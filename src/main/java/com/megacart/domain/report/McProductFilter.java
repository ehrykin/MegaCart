package com.megacart.domain.report;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_product_filter database table.
 * 
 */
@Entity
@Table(name="mc_product_filter")
@NamedQuery(name="McProductFilter.findAll", query="SELECT m FROM McProductFilter m")
public class McProductFilter implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private McProductFilterPK id;

	public McProductFilter() {
	}

	public McProductFilterPK getId() {
		return this.id;
	}

	public void setId(McProductFilterPK id) {
		this.id = id;
	}

}
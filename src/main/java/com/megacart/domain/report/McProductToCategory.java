package com.megacart.domain.report;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_product_to_category database table.
 * 
 */
@Entity
@Table(name="mc_product_to_category")
@NamedQuery(name="McProductToCategory.findAll", query="SELECT m FROM McProductToCategory m")
public class McProductToCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private McProductToCategoryPK id;

	public McProductToCategory() {
	}

	public McProductToCategoryPK getId() {
		return this.id;
	}

	public void setId(McProductToCategoryPK id) {
		this.id = id;
	}

}
package com.megacart.domain.report;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_product_related database table.
 * 
 */
@Entity
@Table(name="mc_product_related")
@NamedQuery(name="McProductRelated.findAll", query="SELECT m FROM McProductRelated m")
public class McProductRelated implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private McProductRelatedPK id;

	public McProductRelated() {
	}

	public McProductRelatedPK getId() {
		return this.id;
	}

	public void setId(McProductRelatedPK id) {
		this.id = id;
	}

}
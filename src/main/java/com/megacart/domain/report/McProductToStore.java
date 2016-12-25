package com.megacart.domain.report;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_product_to_store database table.
 * 
 */
@Entity
@Table(name="mc_product_to_store")
@NamedQuery(name="McProductToStore.findAll", query="SELECT m FROM McProductToStore m")
public class McProductToStore implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private McProductToStorePK id;

	public McProductToStore() {
	}

	public McProductToStorePK getId() {
		return this.id;
	}

	public void setId(McProductToStorePK id) {
		this.id = id;
	}

}
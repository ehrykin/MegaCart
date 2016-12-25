package com.megacart.domain.catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_category_to_store database table.
 * 
 */
@Entity
@Table(name="mc_category_to_store")
@NamedQuery(name="McCategoryToStore.findAll", query="SELECT m FROM McCategoryToStore m")
public class McCategoryToStore implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private McCategoryToStorePK id;

	public McCategoryToStore() {
	}

	public McCategoryToStorePK getId() {
		return this.id;
	}

	public void setId(McCategoryToStorePK id) {
		this.id = id;
	}

}
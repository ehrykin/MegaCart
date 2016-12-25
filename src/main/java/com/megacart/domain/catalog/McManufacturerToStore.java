package com.megacart.domain.catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_manufacturer_to_store database table.
 * 
 */
@Entity
@Table(name="mc_manufacturer_to_store")
@NamedQuery(name="McManufacturerToStore.findAll", query="SELECT m FROM McManufacturerToStore m")
public class McManufacturerToStore implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private McManufacturerToStorePK id;

	public McManufacturerToStore() {
	}

	public McManufacturerToStorePK getId() {
		return this.id;
	}

	public void setId(McManufacturerToStorePK id) {
		this.id = id;
	}

}
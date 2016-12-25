package com.megacart.domain.catalog;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the mc_manufacturer_to_store database table.
 * 
 */
@Embeddable
public class McManufacturerToStorePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="manufacturer_id")
	private Integer manufacturerId;

	@Column(name="store_id")
	private Integer storeId;

	public McManufacturerToStorePK() {
	}
	public Integer getManufacturerId() {
		return this.manufacturerId;
	}
	public void setManufacturerId(Integer manufacturerId) {
		this.manufacturerId = manufacturerId;
	}
	public Integer getStoreId() {
		return this.storeId;
	}
	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof McManufacturerToStorePK)) {
			return false;
		}
		McManufacturerToStorePK castOther = (McManufacturerToStorePK)other;
		return 
			(this.manufacturerId == castOther.manufacturerId)
			&& (this.storeId == castOther.storeId);
	}

	public int hashCode() {
		final Integer prime = 31;
		Integer hash = 17;
		hash = hash * prime + this.manufacturerId;
		hash = hash * prime + this.storeId;
		
		return hash;
	}
}
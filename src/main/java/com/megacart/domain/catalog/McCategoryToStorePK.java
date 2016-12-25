package com.megacart.domain.catalog;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the mc_category_to_store database table.
 * 
 */
@Embeddable
public class McCategoryToStorePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="category_id")
	private Integer categoryId;

	@Column(name="store_id")
	private Integer storeId;

	public McCategoryToStorePK() {
	}
	public Integer getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
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
		if (!(other instanceof McCategoryToStorePK)) {
			return false;
		}
		McCategoryToStorePK castOther = (McCategoryToStorePK)other;
		return 
			(this.categoryId == castOther.categoryId)
			&& (this.storeId == castOther.storeId);
	}

	public int hashCode() {
		final Integer prime = 31;
		Integer hash = 17;
		hash = hash * prime + this.categoryId;
		hash = hash * prime + this.storeId;
		
		return hash;
	}
}
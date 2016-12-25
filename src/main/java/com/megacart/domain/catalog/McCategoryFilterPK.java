package com.megacart.domain.catalog;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the mc_category_filter database table.
 * 
 */
@Embeddable
public class McCategoryFilterPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="category_id")
	private Integer categoryId;

	@Column(name="filter_id")
	private Integer filterId;

	public McCategoryFilterPK() {
	}
	public Integer getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public Integer getFilterId() {
		return this.filterId;
	}
	public void setFilterId(Integer filterId) {
		this.filterId = filterId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof McCategoryFilterPK)) {
			return false;
		}
		McCategoryFilterPK castOther = (McCategoryFilterPK)other;
		return 
			(this.categoryId == castOther.categoryId)
			&& (this.filterId == castOther.filterId);
	}

	public int hashCode() {
		final Integer prime = 31;
		Integer hash = 17;
		hash = hash * prime + this.categoryId;
		hash = hash * prime + this.filterId;
		
		return hash;
	}
}
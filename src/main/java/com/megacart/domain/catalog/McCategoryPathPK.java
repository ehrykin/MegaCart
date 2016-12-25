package com.megacart.domain.catalog;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the mc_category_path database table.
 * 
 */
@Embeddable
public class McCategoryPathPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="category_id")
	private Integer categoryId;

	@Column(name="path_id")
	private Integer pathId;

	public McCategoryPathPK() {
	}
	public Integer getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public Integer getPathId() {
		return this.pathId;
	}
	public void setPathId(Integer pathId) {
		this.pathId = pathId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof McCategoryPathPK)) {
			return false;
		}
		McCategoryPathPK castOther = (McCategoryPathPK)other;
		return 
			(this.categoryId == castOther.categoryId)
			&& (this.pathId == castOther.pathId);
	}

	public int hashCode() {
		final Integer prime = 31;
		Integer hash = 17;
		hash = hash * prime + this.categoryId;
		hash = hash * prime + this.pathId;
		
		return hash;
	}
}
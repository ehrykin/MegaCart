package com.megacart.domain.catalog;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the mc_category_description database table.
 * 
 */
@Embeddable
public class McCategoryDescriptionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="category_id")
	private Integer categoryId;

	@Column(name="language_id")
	private Integer languageId;

	public McCategoryDescriptionPK() {
	}
	public Integer getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public Integer getLanguageId() {
		return this.languageId;
	}
	public void setLanguageId(Integer languageId) {
		this.languageId = languageId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof McCategoryDescriptionPK)) {
			return false;
		}
		McCategoryDescriptionPK castOther = (McCategoryDescriptionPK)other;
		return 
			(this.categoryId == castOther.categoryId)
			&& (this.languageId == castOther.languageId);
	}

	public int hashCode() {
		final Integer prime = 31;
		Integer hash = 17;
		hash = hash * prime + this.categoryId;
		hash = hash * prime + this.languageId;
		
		return hash;
	}
}
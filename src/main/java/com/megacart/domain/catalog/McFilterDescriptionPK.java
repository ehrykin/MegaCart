package com.megacart.domain.catalog;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the mc_filter_description database table.
 * 
 */
@Embeddable
public class McFilterDescriptionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="filter_id")
	private Integer filterId;

	@Column(name="language_id")
	private Integer languageId;

	public McFilterDescriptionPK() {
	}
	public Integer getFilterId() {
		return this.filterId;
	}
	public void setFilterId(Integer filterId) {
		this.filterId = filterId;
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
		if (!(other instanceof McFilterDescriptionPK)) {
			return false;
		}
		McFilterDescriptionPK castOther = (McFilterDescriptionPK)other;
		return 
			(this.filterId == castOther.filterId)
			&& (this.languageId == castOther.languageId);
	}

	public int hashCode() {
		final Integer prime = 31;
		Integer hash = 17;
		hash = hash * prime + this.filterId;
		hash = hash * prime + this.languageId;
		
		return hash;
	}
}
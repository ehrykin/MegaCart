package com.megacart.domain.catalog;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the mc_filter_group_description database table.
 * 
 */
@Embeddable
public class McFilterGroupDescriptionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="filter_group_id")
	private Integer filterGroupId;

	@Column(name="language_id")
	private Integer languageId;

	public McFilterGroupDescriptionPK() {
	}
	public Integer getFilterGroupId() {
		return this.filterGroupId;
	}
	public void setFilterGroupId(Integer filterGroupId) {
		this.filterGroupId = filterGroupId;
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
		if (!(other instanceof McFilterGroupDescriptionPK)) {
			return false;
		}
		McFilterGroupDescriptionPK castOther = (McFilterGroupDescriptionPK)other;
		return 
			(this.filterGroupId == castOther.filterGroupId)
			&& (this.languageId == castOther.languageId);
	}

	public int hashCode() {
		final Integer prime = 31;
		Integer hash = 17;
		hash = hash * prime + this.filterGroupId;
		hash = hash * prime + this.languageId;
		
		return hash;
	}
}
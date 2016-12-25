package com.megacart.domain.catalog;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the mc_attribute_group_description database table.
 * 
 */
@Embeddable
public class McAttributeGroupDescriptionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="attribute_group_id")
	private Integer attributeGroupId;

	@Column(name="language_id")
	private Integer languageId;

	public McAttributeGroupDescriptionPK() {
	}
	public Integer getAttributeGroupId() {
		return this.attributeGroupId;
	}
	public void setAttributeGroupId(Integer attributeGroupId) {
		this.attributeGroupId = attributeGroupId;
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
		if (!(other instanceof McAttributeGroupDescriptionPK)) {
			return false;
		}
		McAttributeGroupDescriptionPK castOther = (McAttributeGroupDescriptionPK)other;
		return 
			(this.attributeGroupId == castOther.attributeGroupId)
			&& (this.languageId == castOther.languageId);
	}

	public int hashCode() {
		final Integer prime = 31;
		Integer hash = 17;
		hash = hash * prime + this.attributeGroupId;
		hash = hash * prime + this.languageId;
		
		return hash;
	}
}
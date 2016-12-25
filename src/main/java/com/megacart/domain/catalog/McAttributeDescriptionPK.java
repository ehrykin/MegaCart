package com.megacart.domain.catalog;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the mc_attribute_description database table.
 * 
 */
@Embeddable
public class McAttributeDescriptionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="attribute_id")
	private Integer attributeId;

	@Column(name="language_id")
	private Integer languageId;

	public McAttributeDescriptionPK() {
	}
	public Integer getAttributeId() {
		return this.attributeId;
	}
	public void setAttributeId(Integer attributeId) {
		this.attributeId = attributeId;
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
		if (!(other instanceof McAttributeDescriptionPK)) {
			return false;
		}
		McAttributeDescriptionPK castOther = (McAttributeDescriptionPK)other;
		return 
			(this.attributeId == castOther.attributeId)
			&& (this.languageId == castOther.languageId);
	}

	public int hashCode() {
		final Integer prime = 31;
		Integer hash = 17;
		hash = hash * prime + this.attributeId;
		hash = hash * prime + this.languageId;
		
		return hash;
	}
}
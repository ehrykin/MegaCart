package com.megacart.domain.customer;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the mc_custom_field_value_description database table.
 * 
 */
@Embeddable
public class McCustomFieldValueDescriptionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="custom_field_value_id")
	private Integer customFieldValueId;

	@Column(name="language_id")
	private Integer languageId;

	public McCustomFieldValueDescriptionPK() {
	}
	public Integer getCustomFieldValueId() {
		return this.customFieldValueId;
	}
	public void setCustomFieldValueId(Integer customFieldValueId) {
		this.customFieldValueId = customFieldValueId;
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
		if (!(other instanceof McCustomFieldValueDescriptionPK)) {
			return false;
		}
		McCustomFieldValueDescriptionPK castOther = (McCustomFieldValueDescriptionPK)other;
		return 
			(this.customFieldValueId == castOther.customFieldValueId)
			&& (this.languageId == castOther.languageId);
	}

	public int hashCode() {
		final Integer prime = 31;
		Integer hash = 17;
		hash = hash * prime + this.customFieldValueId;
		hash = hash * prime + this.languageId;
		
		return hash;
	}
}
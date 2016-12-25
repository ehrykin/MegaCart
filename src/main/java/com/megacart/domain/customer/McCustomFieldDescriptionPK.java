package com.megacart.domain.customer;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the mc_custom_field_description database table.
 * 
 */
@Embeddable
public class McCustomFieldDescriptionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="custom_field_id")
	private Integer customFieldId;

	@Column(name="language_id")
	private Integer languageId;

	public McCustomFieldDescriptionPK() {
	}
	public Integer getCustomFieldId() {
		return this.customFieldId;
	}
	public void setCustomFieldId(Integer customFieldId) {
		this.customFieldId = customFieldId;
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
		if (!(other instanceof McCustomFieldDescriptionPK)) {
			return false;
		}
		McCustomFieldDescriptionPK castOther = (McCustomFieldDescriptionPK)other;
		return 
			(this.customFieldId == castOther.customFieldId)
			&& (this.languageId == castOther.languageId);
	}

	public int hashCode() {
		final Integer prime = 31;
		Integer hash = 17;
		hash = hash * prime + this.customFieldId;
		hash = hash * prime + this.languageId;
		
		return hash;
	}
}
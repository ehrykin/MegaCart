package com.megacart.domain.catalog;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the mc_option_value_description database table.
 * 
 */
@Embeddable
public class McOptionValueDescriptionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="option_value_id")
	private Integer optionValueId;

	@Column(name="language_id")
	private Integer languageId;

	public McOptionValueDescriptionPK() {
	}
	public Integer getOptionValueId() {
		return this.optionValueId;
	}
	public void setOptionValueId(Integer optionValueId) {
		this.optionValueId = optionValueId;
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
		if (!(other instanceof McOptionValueDescriptionPK)) {
			return false;
		}
		McOptionValueDescriptionPK castOther = (McOptionValueDescriptionPK)other;
		return 
			(this.optionValueId == castOther.optionValueId)
			&& (this.languageId == castOther.languageId);
	}

	public int hashCode() {
		final Integer prime = 31;
		Integer hash = 17;
		hash = hash * prime + this.optionValueId;
		hash = hash * prime + this.languageId;
		
		return hash;
	}
}
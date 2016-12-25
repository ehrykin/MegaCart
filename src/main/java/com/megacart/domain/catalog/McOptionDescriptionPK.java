package com.megacart.domain.catalog;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the mc_option_description database table.
 * 
 */
@Embeddable
public class McOptionDescriptionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="option_id")
	private Integer optionId;

	@Column(name="language_id")
	private Integer languageId;

	public McOptionDescriptionPK() {
	}
	public Integer getOptionId() {
		return this.optionId;
	}
	public void setOptionId(Integer optionId) {
		this.optionId = optionId;
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
		if (!(other instanceof McOptionDescriptionPK)) {
			return false;
		}
		McOptionDescriptionPK castOther = (McOptionDescriptionPK)other;
		return 
			(this.optionId == castOther.optionId)
			&& (this.languageId == castOther.languageId);
	}

	public int hashCode() {
		final Integer prime = 31;
		Integer hash = 17;
		hash = hash * prime + this.optionId;
		hash = hash * prime + this.languageId;
		
		return hash;
	}
}
package com.megacart.domain.catalog;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the mc_information_description database table.
 * 
 */
@Embeddable
public class McInformationDescriptionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="information_id")
	private Integer informationId;

	@Column(name="language_id")
	private Integer languageId;

	public McInformationDescriptionPK() {
	}
	public Integer getInformationId() {
		return this.informationId;
	}
	public void setInformationId(Integer informationId) {
		this.informationId = informationId;
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
		if (!(other instanceof McInformationDescriptionPK)) {
			return false;
		}
		McInformationDescriptionPK castOther = (McInformationDescriptionPK)other;
		return 
			(this.informationId == castOther.informationId)
			&& (this.languageId == castOther.languageId);
	}

	public int hashCode() {
		final Integer prime = 31;
		Integer hash = 17;
		hash = hash * prime + this.informationId;
		hash = hash * prime + this.languageId;
		
		return hash;
	}
}
package com.megacart.domain.localisation;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the mc_weight_class_description database table.
 * 
 */
@Embeddable
public class McWeightClassDescriptionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="weight_class_id")
	private Integer weightClassId;

	@Column(name="language_id")
	private Integer languageId;

	public McWeightClassDescriptionPK() {
	}
	public Integer getWeightClassId() {
		return this.weightClassId;
	}
	public void setWeightClassId(Integer weightClassId) {
		this.weightClassId = weightClassId;
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
		if (!(other instanceof McWeightClassDescriptionPK)) {
			return false;
		}
		McWeightClassDescriptionPK castOther = (McWeightClassDescriptionPK)other;
		return 
			(this.weightClassId == castOther.weightClassId)
			&& (this.languageId == castOther.languageId);
	}

	public int hashCode() {
		final Integer prime = 31;
		Integer hash = 17;
		hash = hash * prime + this.weightClassId;
		hash = hash * prime + this.languageId;
		
		return hash;
	}
}
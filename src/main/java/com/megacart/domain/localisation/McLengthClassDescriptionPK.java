package com.megacart.domain.localisation;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the mc_length_class_description database table.
 * 
 */
@Embeddable
public class McLengthClassDescriptionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="length_class_id")
	private Integer lengthClassId;

	@Column(name="language_id")
	private Integer languageId;

	public McLengthClassDescriptionPK() {
	}
	public Integer getLengthClassId() {
		return this.lengthClassId;
	}
	public void setLengthClassId(Integer lengthClassId) {
		this.lengthClassId = lengthClassId;
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
		if (!(other instanceof McLengthClassDescriptionPK)) {
			return false;
		}
		McLengthClassDescriptionPK castOther = (McLengthClassDescriptionPK)other;
		return 
			(this.lengthClassId == castOther.lengthClassId)
			&& (this.languageId == castOther.languageId);
	}

	public int hashCode() {
		final Integer prime = 31;
		Integer hash = 17;
		hash = hash * prime + this.lengthClassId;
		hash = hash * prime + this.languageId;
		
		return hash;
	}
}
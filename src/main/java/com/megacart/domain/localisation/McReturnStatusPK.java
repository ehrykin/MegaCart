package com.megacart.domain.localisation;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the mc_return_status database table.
 * 
 */
@Embeddable
public class McReturnStatusPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="return_status_id")
	private Integer returnStatusId;

	@Column(name="language_id")
	private Integer languageId;

	public McReturnStatusPK() {
	}
	public Integer getReturnStatusId() {
		return this.returnStatusId;
	}
	public void setReturnStatusId(Integer returnStatusId) {
		this.returnStatusId = returnStatusId;
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
		if (!(other instanceof McReturnStatusPK)) {
			return false;
		}
		McReturnStatusPK castOther = (McReturnStatusPK)other;
		return 
			(this.returnStatusId == castOther.returnStatusId)
			&& (this.languageId == castOther.languageId);
	}

	public int hashCode() {
		final Integer prime = 31;
		Integer hash = 17;
		hash = hash * prime + this.returnStatusId;
		hash = hash * prime + this.languageId;
		
		return hash;
	}
}
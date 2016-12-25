package com.megacart.domain.localisation;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the mc_return_reason database table.
 * 
 */
@Embeddable
public class McReturnReasonPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="return_reason_id")
	private Integer returnReasonId;

	@Column(name="language_id")
	private Integer languageId;

	public McReturnReasonPK() {
	}
	public Integer getReturnReasonId() {
		return this.returnReasonId;
	}
	public void setReturnReasonId(Integer returnReasonId) {
		this.returnReasonId = returnReasonId;
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
		if (!(other instanceof McReturnReasonPK)) {
			return false;
		}
		McReturnReasonPK castOther = (McReturnReasonPK)other;
		return 
			(this.returnReasonId == castOther.returnReasonId)
			&& (this.languageId == castOther.languageId);
	}

	public int hashCode() {
		final Integer prime = 31;
		Integer hash = 17;
		hash = hash * prime + this.returnReasonId;
		hash = hash * prime + this.languageId;
		
		return hash;
	}
}
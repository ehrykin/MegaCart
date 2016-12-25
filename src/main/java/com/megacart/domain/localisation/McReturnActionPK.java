package com.megacart.domain.localisation;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the mc_return_action database table.
 * 
 */
@Embeddable
public class McReturnActionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="return_action_id")
	private Integer returnActionId;

	@Column(name="language_id")
	private Integer languageId;

	public McReturnActionPK() {
	}
	public Integer getReturnActionId() {
		return this.returnActionId;
	}
	public void setReturnActionId(Integer returnActionId) {
		this.returnActionId = returnActionId;
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
		if (!(other instanceof McReturnActionPK)) {
			return false;
		}
		McReturnActionPK castOther = (McReturnActionPK)other;
		return 
			(this.returnActionId == castOther.returnActionId)
			&& (this.languageId == castOther.languageId);
	}

	public int hashCode() {
		final Integer prime = 31;
		Integer hash = 17;
		hash = hash * prime + this.returnActionId;
		hash = hash * prime + this.languageId;
		
		return hash;
	}
}
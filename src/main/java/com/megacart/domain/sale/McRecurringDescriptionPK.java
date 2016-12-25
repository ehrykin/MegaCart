package com.megacart.domain.sale;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the mc_recurring_description database table.
 * 
 */
@Embeddable
public class McRecurringDescriptionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="recurring_id")
	private Integer recurringId;

	@Column(name="language_id")
	private Integer languageId;

	public McRecurringDescriptionPK() {
	}
	public Integer getRecurringId() {
		return this.recurringId;
	}
	public void setRecurringId(Integer recurringId) {
		this.recurringId = recurringId;
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
		if (!(other instanceof McRecurringDescriptionPK)) {
			return false;
		}
		McRecurringDescriptionPK castOther = (McRecurringDescriptionPK)other;
		return 
			(this.recurringId == castOther.recurringId)
			&& (this.languageId == castOther.languageId);
	}

	public int hashCode() {
		final Integer prime = 31;
		Integer hash = 17;
		hash = hash * prime + this.recurringId;
		hash = hash * prime + this.languageId;
		
		return hash;
	}
}
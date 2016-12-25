package com.megacart.domain.report;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the mc_customer_group_description database table.
 * 
 */
@Embeddable
public class McCustomerGroupDescriptionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="customer_group_id")
	private Integer customerGroupId;

	@Column(name="language_id")
	private Integer languageId;

	public McCustomerGroupDescriptionPK() {
	}
	public Integer getCustomerGroupId() {
		return this.customerGroupId;
	}
	public void setCustomerGroupId(Integer customerGroupId) {
		this.customerGroupId = customerGroupId;
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
		if (!(other instanceof McCustomerGroupDescriptionPK)) {
			return false;
		}
		McCustomerGroupDescriptionPK castOther = (McCustomerGroupDescriptionPK)other;
		return 
			(this.customerGroupId == castOther.customerGroupId)
			&& (this.languageId == castOther.languageId);
	}

	public int hashCode() {
		final Integer prime = 31;
		Integer hash = 17;
		hash = hash * prime + this.customerGroupId;
		hash = hash * prime + this.languageId;
		
		return hash;
	}
}
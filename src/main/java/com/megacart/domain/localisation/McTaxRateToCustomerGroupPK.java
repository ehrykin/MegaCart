package com.megacart.domain.localisation;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the mc_tax_rate_to_customer_group database table.
 * 
 */
@Embeddable
public class McTaxRateToCustomerGroupPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="tax_rate_id")
	private Integer taxRateId;

	@Column(name="customer_group_id")
	private Integer customerGroupId;

	public McTaxRateToCustomerGroupPK() {
	}
	public Integer getTaxRateId() {
		return this.taxRateId;
	}
	public void setTaxRateId(Integer taxRateId) {
		this.taxRateId = taxRateId;
	}
	public Integer getCustomerGroupId() {
		return this.customerGroupId;
	}
	public void setCustomerGroupId(Integer customerGroupId) {
		this.customerGroupId = customerGroupId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof McTaxRateToCustomerGroupPK)) {
			return false;
		}
		McTaxRateToCustomerGroupPK castOther = (McTaxRateToCustomerGroupPK)other;
		return 
			(this.taxRateId == castOther.taxRateId)
			&& (this.customerGroupId == castOther.customerGroupId);
	}

	public int hashCode() {
		final Integer prime = 31;
		Integer hash = 17;
		hash = hash * prime + this.taxRateId;
		hash = hash * prime + this.customerGroupId;
		
		return hash;
	}
}
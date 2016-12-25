package com.megacart.domain.report;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the mc_product_recurring database table.
 * 
 */
@Embeddable
public class McProductRecurringPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="product_id")
	private Integer productId;

	@Column(name="recurring_id")
	private Integer recurringId;

	@Column(name="customer_group_id")
	private Integer customerGroupId;

	public McProductRecurringPK() {
	}
	public Integer getProductId() {
		return this.productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public Integer getRecurringId() {
		return this.recurringId;
	}
	public void setRecurringId(Integer recurringId) {
		this.recurringId = recurringId;
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
		if (!(other instanceof McProductRecurringPK)) {
			return false;
		}
		McProductRecurringPK castOther = (McProductRecurringPK)other;
		return 
			(this.productId == castOther.productId)
			&& (this.recurringId == castOther.recurringId)
			&& (this.customerGroupId == castOther.customerGroupId);
	}

	public int hashCode() {
		final Integer prime = 31;
		Integer hash = 17;
		hash = hash * prime + this.productId;
		hash = hash * prime + this.recurringId;
		hash = hash * prime + this.customerGroupId;
		
		return hash;
	}
}
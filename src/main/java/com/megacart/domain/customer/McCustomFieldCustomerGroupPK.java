package com.megacart.domain.customer;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the mc_custom_field_customer_group database table.
 * 
 */
@Embeddable
public class McCustomFieldCustomerGroupPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="custom_field_id")
	private Integer customFieldId;

	@Column(name="customer_group_id")
	private Integer customerGroupId;

	public McCustomFieldCustomerGroupPK() {
	}
	public Integer getCustomFieldId() {
		return this.customFieldId;
	}
	public void setCustomFieldId(Integer customFieldId) {
		this.customFieldId = customFieldId;
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
		if (!(other instanceof McCustomFieldCustomerGroupPK)) {
			return false;
		}
		McCustomFieldCustomerGroupPK castOther = (McCustomFieldCustomerGroupPK)other;
		return 
			(this.customFieldId == castOther.customFieldId)
			&& (this.customerGroupId == castOther.customerGroupId);
	}

	public int hashCode() {
		final Integer prime = 31;
		Integer hash = 17;
		hash = hash * prime + this.customFieldId;
		hash = hash * prime + this.customerGroupId;
		
		return hash;
	}
}
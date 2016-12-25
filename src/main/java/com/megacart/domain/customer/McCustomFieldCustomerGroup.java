package com.megacart.domain.customer;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_custom_field_customer_group database table.
 * 
 */
@Entity
@Table(name="mc_custom_field_customer_group")
@NamedQuery(name="McCustomFieldCustomerGroup.findAll", query="SELECT m FROM McCustomFieldCustomerGroup m")
public class McCustomFieldCustomerGroup implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private McCustomFieldCustomerGroupPK id;

	private byte required;

	public McCustomFieldCustomerGroup() {
	}

	public McCustomFieldCustomerGroupPK getId() {
		return this.id;
	}

	public void setId(McCustomFieldCustomerGroupPK id) {
		this.id = id;
	}

	public byte getRequired() {
		return this.required;
	}

	public void setRequired(byte required) {
		this.required = required;
	}

}
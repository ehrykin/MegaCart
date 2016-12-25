package com.megacart.domain.localisation;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_tax_rate_to_customer_group database table.
 * 
 */
@Entity
@Table(name="mc_tax_rate_to_customer_group")
@NamedQuery(name="McTaxRateToCustomerGroup.findAll", query="SELECT m FROM McTaxRateToCustomerGroup m")
public class McTaxRateToCustomerGroup implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private McTaxRateToCustomerGroupPK id;

	public McTaxRateToCustomerGroup() {
	}

	public McTaxRateToCustomerGroupPK getId() {
		return this.id;
	}

	public void setId(McTaxRateToCustomerGroupPK id) {
		this.id = id;
	}

}
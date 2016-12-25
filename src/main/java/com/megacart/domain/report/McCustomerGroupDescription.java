package com.megacart.domain.report;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_customer_group_description database table.
 * 
 */
@Entity
@Table(name="mc_customer_group_description")
@NamedQuery(name="McCustomerGroupDescription.findAll", query="SELECT m FROM McCustomerGroupDescription m")
public class McCustomerGroupDescription implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private McCustomerGroupDescriptionPK id;

	@Lob
	private String description;

	private String name;

	public McCustomerGroupDescription() {
	}

	public McCustomerGroupDescriptionPK getId() {
		return this.id;
	}

	public void setId(McCustomerGroupDescriptionPK id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
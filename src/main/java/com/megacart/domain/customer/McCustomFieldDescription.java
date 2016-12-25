package com.megacart.domain.customer;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_custom_field_description database table.
 * 
 */
@Entity
@Table(name="mc_custom_field_description")
@NamedQuery(name="McCustomFieldDescription.findAll", query="SELECT m FROM McCustomFieldDescription m")
public class McCustomFieldDescription implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private McCustomFieldDescriptionPK id;

	private String name;

	public McCustomFieldDescription() {
	}

	public McCustomFieldDescriptionPK getId() {
		return this.id;
	}

	public void setId(McCustomFieldDescriptionPK id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
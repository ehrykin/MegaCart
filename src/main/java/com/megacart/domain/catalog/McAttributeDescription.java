package com.megacart.domain.catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_attribute_description database table.
 * 
 */
@Entity
@Table(name="mc_attribute_description")
@NamedQuery(name="McAttributeDescription.findAll", query="SELECT m FROM McAttributeDescription m")
public class McAttributeDescription implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private McAttributeDescriptionPK id;

	private String name;

	public McAttributeDescription() {
	}

	public McAttributeDescriptionPK getId() {
		return this.id;
	}

	public void setId(McAttributeDescriptionPK id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
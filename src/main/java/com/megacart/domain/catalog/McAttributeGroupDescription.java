package com.megacart.domain.catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_attribute_group_description database table.
 * 
 */
@Entity
@Table(name="mc_attribute_group_description")
@NamedQuery(name="McAttributeGroupDescription.findAll", query="SELECT m FROM McAttributeGroupDescription m")
public class McAttributeGroupDescription implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private McAttributeGroupDescriptionPK id;

	private String name;

	public McAttributeGroupDescription() {
	}

	public McAttributeGroupDescriptionPK getId() {
		return this.id;
	}

	public void setId(McAttributeGroupDescriptionPK id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
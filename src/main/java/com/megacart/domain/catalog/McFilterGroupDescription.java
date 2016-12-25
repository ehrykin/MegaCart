package com.megacart.domain.catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_filter_group_description database table.
 * 
 */
@Entity
@Table(name="mc_filter_group_description")
@NamedQuery(name="McFilterGroupDescription.findAll", query="SELECT m FROM McFilterGroupDescription m")
public class McFilterGroupDescription implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private McFilterGroupDescriptionPK id;

	private String name;

	public McFilterGroupDescription() {
	}

	public McFilterGroupDescriptionPK getId() {
		return this.id;
	}

	public void setId(McFilterGroupDescriptionPK id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
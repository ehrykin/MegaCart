package com.megacart.domain.catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_option_description database table.
 * 
 */
@Entity
@Table(name="mc_option_description")
@NamedQuery(name="McOptionDescription.findAll", query="SELECT m FROM McOptionDescription m")
public class McOptionDescription implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private McOptionDescriptionPK id;

	private String name;

	public McOptionDescription() {
	}

	public McOptionDescriptionPK getId() {
		return this.id;
	}

	public void setId(McOptionDescriptionPK id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
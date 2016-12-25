package com.megacart.domain.design;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_menu_description database table.
 * 
 */
@Entity
@Table(name="mc_menu_description")
@NamedQuery(name="McMenuDescription.findAll", query="SELECT m FROM McMenuDescription m")
public class McMenuDescription implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private McMenuDescriptionPK id;

	private String name;

	public McMenuDescription() {
	}

	public McMenuDescriptionPK getId() {
		return this.id;
	}

	public void setId(McMenuDescriptionPK id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
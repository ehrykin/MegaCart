package com.megacart.domain.sale;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_recurring_description database table.
 * 
 */
@Entity
@Table(name="mc_recurring_description")
@NamedQuery(name="McRecurringDescription.findAll", query="SELECT m FROM McRecurringDescription m")
public class McRecurringDescription implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private McRecurringDescriptionPK id;

	private String name;

	public McRecurringDescription() {
	}

	public McRecurringDescriptionPK getId() {
		return this.id;
	}

	public void setId(McRecurringDescriptionPK id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
package com.megacart.domain.report;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_product_recurring database table.
 * 
 */
@Entity
@Table(name="mc_product_recurring")
@NamedQuery(name="McProductRecurring.findAll", query="SELECT m FROM McProductRecurring m")
public class McProductRecurring implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private McProductRecurringPK id;

	public McProductRecurring() {
	}

	public McProductRecurringPK getId() {
		return this.id;
	}

	public void setId(McProductRecurringPK id) {
		this.id = id;
	}

}
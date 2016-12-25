package com.megacart.domain.localisation;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_order_status database table.
 * 
 */
@Entity
@Table(name="mc_order_status")
@NamedQuery(name="McOrderStatus.findAll", query="SELECT m FROM McOrderStatus m")
public class McOrderStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private McOrderStatusPK id;

	private String name;

	public McOrderStatus() {
	}

	public McOrderStatusPK getId() {
		return this.id;
	}

	public void setId(McOrderStatusPK id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
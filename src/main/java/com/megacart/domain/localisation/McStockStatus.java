package com.megacart.domain.localisation;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_stock_status database table.
 * 
 */
@Entity
@Table(name="mc_stock_status")
@NamedQuery(name="McStockStatus.findAll", query="SELECT m FROM McStockStatus m")
public class McStockStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private McStockStatusPK id;

	private String name;

	public McStockStatus() {
	}

	public McStockStatusPK getId() {
		return this.id;
	}

	public void setId(McStockStatusPK id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
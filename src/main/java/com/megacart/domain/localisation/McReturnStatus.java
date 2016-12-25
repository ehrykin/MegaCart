package com.megacart.domain.localisation;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_return_status database table.
 * 
 */
@Entity
@Table(name="mc_return_status")
@NamedQuery(name="McReturnStatus.findAll", query="SELECT m FROM McReturnStatus m")
public class McReturnStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private McReturnStatusPK id;

	private String name;

	public McReturnStatus() {
	}

	public McReturnStatusPK getId() {
		return this.id;
	}

	public void setId(McReturnStatusPK id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
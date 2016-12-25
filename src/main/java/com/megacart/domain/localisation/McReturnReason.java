package com.megacart.domain.localisation;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_return_reason database table.
 * 
 */
@Entity
@Table(name="mc_return_reason")
@NamedQuery(name="McReturnReason.findAll", query="SELECT m FROM McReturnReason m")
public class McReturnReason implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private McReturnReasonPK id;

	private String name;

	public McReturnReason() {
	}

	public McReturnReasonPK getId() {
		return this.id;
	}

	public void setId(McReturnReasonPK id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
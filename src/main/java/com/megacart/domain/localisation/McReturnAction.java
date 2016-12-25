package com.megacart.domain.localisation;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_return_action database table.
 * 
 */
@Entity
@Table(name="mc_return_action")
@NamedQuery(name="McReturnAction.findAll", query="SELECT m FROM McReturnAction m")
public class McReturnAction implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private McReturnActionPK id;

	private String name;

	public McReturnAction() {
	}

	public McReturnActionPK getId() {
		return this.id;
	}

	public void setId(McReturnActionPK id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
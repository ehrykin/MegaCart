package com.megacart.domain.catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_category_path database table.
 * 
 */
@Entity
@Table(name="mc_category_path")
@NamedQuery(name="McCategoryPath.findAll", query="SELECT m FROM McCategoryPath m")
public class McCategoryPath implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private McCategoryPathPK id;

	private Integer level;

	public McCategoryPath() {
	}

	public McCategoryPathPK getId() {
		return this.id;
	}

	public void setId(McCategoryPathPK id) {
		this.id = id;
	}

	public Integer getLevel() {
		return this.level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

}
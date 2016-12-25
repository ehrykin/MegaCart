package com.megacart.domain.design;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the mc_menu_description database table.
 * 
 */
@Embeddable
public class McMenuDescriptionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="menu_id")
	private Integer menuId;

	@Column(name="language_id")
	private Integer languageId;

	public McMenuDescriptionPK() {
	}
	public Integer getMenuId() {
		return this.menuId;
	}
	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}
	public Integer getLanguageId() {
		return this.languageId;
	}
	public void setLanguageId(Integer languageId) {
		this.languageId = languageId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof McMenuDescriptionPK)) {
			return false;
		}
		McMenuDescriptionPK castOther = (McMenuDescriptionPK)other;
		return 
			(this.menuId == castOther.menuId)
			&& (this.languageId == castOther.languageId);
	}

	public int hashCode() {
		final Integer prime = 31;
		Integer hash = 17;
		hash = hash * prime + this.menuId;
		hash = hash * prime + this.languageId;
		
		return hash;
	}
}
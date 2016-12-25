package com.megacart.domain.catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_category_to_layout database table.
 * 
 */
@Entity
@Table(name="mc_category_to_layout")
@NamedQuery(name="McCategoryToLayout.findAll", query="SELECT m FROM McCategoryToLayout m")
public class McCategoryToLayout implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private McCategoryToLayoutPK id;

	@Column(name="layout_id")
	private Integer layoutId;

	public McCategoryToLayout() {
	}

	public McCategoryToLayoutPK getId() {
		return this.id;
	}

	public void setId(McCategoryToLayoutPK id) {
		this.id = id;
	}

	public Integer getLayoutId() {
		return this.layoutId;
	}

	public void setLayoutId(Integer layoutId) {
		this.layoutId = layoutId;
	}

}
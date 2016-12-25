package com.megacart.domain.report;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_product_to_layout database table.
 * 
 */
@Entity
@Table(name="mc_product_to_layout")
@NamedQuery(name="McProductToLayout.findAll", query="SELECT m FROM McProductToLayout m")
public class McProductToLayout implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private McProductToLayoutPK id;

	@Column(name="layout_id")
	private Integer layoutId;

	public McProductToLayout() {
	}

	public McProductToLayoutPK getId() {
		return this.id;
	}

	public void setId(McProductToLayoutPK id) {
		this.id = id;
	}

	public Integer getLayoutId() {
		return this.layoutId;
	}

	public void setLayoutId(Integer layoutId) {
		this.layoutId = layoutId;
	}

}
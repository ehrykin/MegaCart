package com.megacart.domain.catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_information_to_layout database table.
 * 
 */
@Entity
@Table(name="mc_information_to_layout")
@NamedQuery(name="McInformationToLayout.findAll", query="SELECT m FROM McInformationToLayout m")
public class McInformationToLayout implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private McInformationToLayoutPK id;

	@Column(name="layout_id")
	private Integer layoutId;

	public McInformationToLayout() {
	}

	public McInformationToLayoutPK getId() {
		return this.id;
	}

	public void setId(McInformationToLayoutPK id) {
		this.id = id;
	}

	public Integer getLayoutId() {
		return this.layoutId;
	}

	public void setLayoutId(Integer layoutId) {
		this.layoutId = layoutId;
	}

}
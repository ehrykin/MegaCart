package com.megacart.domain.catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_attribute database table.
 * 
 */
@Entity
@Table(name="mc_attribute")
@NamedQuery(name="McAttribute.findAll", query="SELECT m FROM McAttribute m")
public class McAttribute implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="attribute_id")
	private Integer attributeId;

	@Column(name="attribute_group_id")
	private Integer attributeGroupId;

	@Column(name="sort_order")
	private Integer sortOrder;

	public McAttribute() {
	}

	public Integer getAttributeId() {
		return this.attributeId;
	}

	public void setAttributeId(Integer attributeId) {
		this.attributeId = attributeId;
	}

	public Integer getAttributeGroupId() {
		return this.attributeGroupId;
	}

	public void setAttributeGroupId(Integer attributeGroupId) {
		this.attributeGroupId = attributeGroupId;
	}

	public Integer getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(Integer sortOrder) {
		this.sortOrder = sortOrder;
	}

}
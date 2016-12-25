package com.megacart.domain.catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_attribute_group database table.
 * 
 */
@Entity
@Table(name="mc_attribute_group")
@NamedQuery(name="McAttributeGroup.findAll", query="SELECT m FROM McAttributeGroup m")
public class McAttributeGroup implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="attribute_group_id")
	private Integer attributeGroupId;

	@Column(name="sort_order")
	private Integer sortOrder;

	public McAttributeGroup() {
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
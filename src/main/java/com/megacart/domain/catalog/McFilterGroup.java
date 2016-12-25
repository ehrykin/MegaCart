package com.megacart.domain.catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_filter_group database table.
 * 
 */
@Entity
@Table(name="mc_filter_group")
@NamedQuery(name="McFilterGroup.findAll", query="SELECT m FROM McFilterGroup m")
public class McFilterGroup implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="filter_group_id")
	private Integer filterGroupId;

	@Column(name="sort_order")
	private Integer sortOrder;

	public McFilterGroup() {
	}

	public Integer getFilterGroupId() {
		return this.filterGroupId;
	}

	public void setFilterGroupId(Integer filterGroupId) {
		this.filterGroupId = filterGroupId;
	}

	public Integer getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(Integer sortOrder) {
		this.sortOrder = sortOrder;
	}

}
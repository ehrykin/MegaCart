package com.megacart.domain.catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_filter database table.
 * 
 */
@Entity
@Table(name="mc_filter")
@NamedQuery(name="McFilter.findAll", query="SELECT m FROM McFilter m")
public class McFilter implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="filter_id")
	private Integer filterId;

	@Column(name="filter_group_id")
	private Integer filterGroupId;

	@Column(name="sort_order")
	private Integer sortOrder;

	public McFilter() {
	}

	public Integer getFilterId() {
		return this.filterId;
	}

	public void setFilterId(Integer filterId) {
		this.filterId = filterId;
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
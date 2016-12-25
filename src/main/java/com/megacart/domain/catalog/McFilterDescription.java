package com.megacart.domain.catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_filter_description database table.
 * 
 */
@Entity
@Table(name="mc_filter_description")
@NamedQuery(name="McFilterDescription.findAll", query="SELECT m FROM McFilterDescription m")
public class McFilterDescription implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private McFilterDescriptionPK id;

	@Column(name="filter_group_id")
	private Integer filterGroupId;

	private String name;

	public McFilterDescription() {
	}

	public McFilterDescriptionPK getId() {
		return this.id;
	}

	public void setId(McFilterDescriptionPK id) {
		this.id = id;
	}

	public Integer getFilterGroupId() {
		return this.filterGroupId;
	}

	public void setFilterGroupId(Integer filterGroupId) {
		this.filterGroupId = filterGroupId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
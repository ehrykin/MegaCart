package com.megacart.domain.catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_manufacturer database table.
 * 
 */
@Entity
@Table(name="mc_manufacturer")
@NamedQuery(name="McManufacturer.findAll", query="SELECT m FROM McManufacturer m")
public class McManufacturer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="manufacturer_id")
	private Integer manufacturerId;

	private String image;

	private String name;

	@Column(name="sort_order")
	private Integer sortOrder;

	public McManufacturer() {
	}

	public Integer getManufacturerId() {
		return this.manufacturerId;
	}

	public void setManufacturerId(Integer manufacturerId) {
		this.manufacturerId = manufacturerId;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(Integer sortOrder) {
		this.sortOrder = sortOrder;
	}

}
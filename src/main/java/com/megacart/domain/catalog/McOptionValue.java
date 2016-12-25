package com.megacart.domain.catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_option_value database table.
 * 
 */
@Entity
@Table(name="mc_option_value")
@NamedQuery(name="McOptionValue.findAll", query="SELECT m FROM McOptionValue m")
public class McOptionValue implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="option_value_id")
	private Integer optionValueId;

	private String image;

	@Column(name="option_id")
	private Integer optionId;

	@Column(name="sort_order")
	private Integer sortOrder;

	public McOptionValue() {
	}

	public Integer getOptionValueId() {
		return this.optionValueId;
	}

	public void setOptionValueId(Integer optionValueId) {
		this.optionValueId = optionValueId;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Integer getOptionId() {
		return this.optionId;
	}

	public void setOptionId(Integer optionId) {
		this.optionId = optionId;
	}

	public Integer getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(Integer sortOrder) {
		this.sortOrder = sortOrder;
	}

}
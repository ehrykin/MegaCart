package com.megacart.domain.report;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_product_image database table.
 * 
 */
@Entity
@Table(name="mc_product_image")
@NamedQuery(name="McProductImage.findAll", query="SELECT m FROM McProductImage m")
public class McProductImage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="product_image_id")
	private Integer productImageId;

	private String image;

	@Column(name="product_id")
	private Integer productId;

	@Column(name="sort_order")
	private Integer sortOrder;

	public McProductImage() {
	}

	public Integer getProductImageId() {
		return this.productImageId;
	}

	public void setProductImageId(Integer productImageId) {
		this.productImageId = productImageId;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Integer getProductId() {
		return this.productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(Integer sortOrder) {
		this.sortOrder = sortOrder;
	}

}
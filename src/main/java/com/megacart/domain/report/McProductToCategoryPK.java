package com.megacart.domain.report;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the mc_product_to_category database table.
 * 
 */
@Embeddable
public class McProductToCategoryPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="product_id")
	private Integer productId;

	@Column(name="category_id")
	private Integer categoryId;

	public McProductToCategoryPK() {
	}
	public Integer getProductId() {
		return this.productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public Integer getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof McProductToCategoryPK)) {
			return false;
		}
		McProductToCategoryPK castOther = (McProductToCategoryPK)other;
		return 
			(this.productId == castOther.productId)
			&& (this.categoryId == castOther.categoryId);
	}

	public int hashCode() {
		final Integer prime = 31;
		Integer hash = 17;
		hash = hash * prime + this.productId;
		hash = hash * prime + this.categoryId;
		
		return hash;
	}
}
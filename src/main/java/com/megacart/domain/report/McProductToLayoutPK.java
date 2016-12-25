package com.megacart.domain.report;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the mc_product_to_layout database table.
 * 
 */
@Embeddable
public class McProductToLayoutPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="product_id")
	private Integer productId;

	@Column(name="store_id")
	private Integer storeId;

	public McProductToLayoutPK() {
	}
	public Integer getProductId() {
		return this.productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public Integer getStoreId() {
		return this.storeId;
	}
	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof McProductToLayoutPK)) {
			return false;
		}
		McProductToLayoutPK castOther = (McProductToLayoutPK)other;
		return 
			(this.productId == castOther.productId)
			&& (this.storeId == castOther.storeId);
	}

	public int hashCode() {
		final Integer prime = 31;
		Integer hash = 17;
		hash = hash * prime + this.productId;
		hash = hash * prime + this.storeId;
		
		return hash;
	}
}
package com.megacart.domain.report;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the mc_customer_wishlist database table.
 * 
 */
@Embeddable
public class McCustomerWishlistPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="customer_id")
	private Integer customerId;

	@Column(name="product_id")
	private Integer productId;

	public McCustomerWishlistPK() {
	}
	public Integer getCustomerId() {
		return this.customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public Integer getProductId() {
		return this.productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof McCustomerWishlistPK)) {
			return false;
		}
		McCustomerWishlistPK castOther = (McCustomerWishlistPK)other;
		return 
			(this.customerId == castOther.customerId)
			&& (this.productId == castOther.productId);
	}

	public int hashCode() {
		final Integer prime = 31;
		Integer hash = 17;
		hash = hash * prime + this.customerId;
		hash = hash * prime + this.productId;
		
		return hash;
	}
}
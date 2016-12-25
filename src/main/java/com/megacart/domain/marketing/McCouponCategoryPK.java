package com.megacart.domain.marketing;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the mc_coupon_category database table.
 * 
 */
@Embeddable
public class McCouponCategoryPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="coupon_id")
	private Integer couponId;

	@Column(name="category_id")
	private Integer categoryId;

	public McCouponCategoryPK() {
	}
	public Integer getCouponId() {
		return this.couponId;
	}
	public void setCouponId(Integer couponId) {
		this.couponId = couponId;
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
		if (!(other instanceof McCouponCategoryPK)) {
			return false;
		}
		McCouponCategoryPK castOther = (McCouponCategoryPK)other;
		return 
			(this.couponId == castOther.couponId)
			&& (this.categoryId == castOther.categoryId);
	}

	public int hashCode() {
		final Integer prime = 31;
		Integer hash = 17;
		hash = hash * prime + this.couponId;
		hash = hash * prime + this.categoryId;
		
		return hash;
	}
}
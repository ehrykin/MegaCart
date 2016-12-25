package com.megacart.domain.marketing;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_coupon_category database table.
 * 
 */
@Entity
@Table(name="mc_coupon_category")
@NamedQuery(name="McCouponCategory.findAll", query="SELECT m FROM McCouponCategory m")
public class McCouponCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private McCouponCategoryPK id;

	public McCouponCategory() {
	}

	public McCouponCategoryPK getId() {
		return this.id;
	}

	public void setId(McCouponCategoryPK id) {
		this.id = id;
	}

}
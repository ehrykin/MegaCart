package com.megacart.domain.marketing;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_coupon_product database table.
 * 
 */
@Entity
@Table(name="mc_coupon_product")
@NamedQuery(name="McCouponProduct.findAll", query="SELECT m FROM McCouponProduct m")
public class McCouponProduct implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="coupon_product_id")
	private Integer couponProductId;

	@Column(name="coupon_id")
	private Integer couponId;

	@Column(name="product_id")
	private Integer productId;

	public McCouponProduct() {
	}

	public Integer getCouponProductId() {
		return this.couponProductId;
	}

	public void setCouponProductId(Integer couponProductId) {
		this.couponProductId = couponProductId;
	}

	public Integer getCouponId() {
		return this.couponId;
	}

	public void setCouponId(Integer couponId) {
		this.couponId = couponId;
	}

	public Integer getProductId() {
		return this.productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

}
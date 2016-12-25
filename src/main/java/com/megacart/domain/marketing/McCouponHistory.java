package com.megacart.domain.marketing;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the mc_coupon_history database table.
 * 
 */
@Entity
@Table(name="mc_coupon_history")
@NamedQuery(name="McCouponHistory.findAll", query="SELECT m FROM McCouponHistory m")
public class McCouponHistory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="coupon_history_id")
	private Integer couponHistoryId;

	private BigDecimal amount;

	@Column(name="coupon_id")
	private Integer couponId;

	@Column(name="customer_id")
	private Integer customerId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_added")
	private Date dateAdded;

	@Column(name="order_id")
	private Integer orderId;

	public McCouponHistory() {
	}

	public Integer getCouponHistoryId() {
		return this.couponHistoryId;
	}

	public void setCouponHistoryId(Integer couponHistoryId) {
		this.couponHistoryId = couponHistoryId;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Integer getCouponId() {
		return this.couponId;
	}

	public void setCouponId(Integer couponId) {
		this.couponId = couponId;
	}

	public Integer getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Date getDateAdded() {
		return this.dateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}

	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

}
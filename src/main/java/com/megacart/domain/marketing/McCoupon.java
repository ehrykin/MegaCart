package com.megacart.domain.marketing;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the mc_coupon database table.
 * 
 */
@Entity
@Table(name="mc_coupon")
@NamedQuery(name="McCoupon.findAll", query="SELECT m FROM McCoupon m")
public class McCoupon implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="coupon_id")
	private Integer couponId;

	private String code;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_added")
	private Date dateAdded;

	@Temporal(TemporalType.DATE)
	@Column(name="date_end")
	private Date dateEnd;

	@Temporal(TemporalType.DATE)
	@Column(name="date_start")
	private Date dateStart;

	private BigDecimal discount;

	private byte logged;

	private String name;

	private byte shipping;

	private byte status;

	private BigDecimal total;

	private String type;

	@Column(name="uses_customer")
	private String usesCustomer;

	@Column(name="uses_total")
	private Integer usesTotal;

	public McCoupon() {
	}

	public Integer getCouponId() {
		return this.couponId;
	}

	public void setCouponId(Integer couponId) {
		this.couponId = couponId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Date getDateAdded() {
		return this.dateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}

	public Date getDateEnd() {
		return this.dateEnd;
	}

	public void setDateEnd(Date dateEnd) {
		this.dateEnd = dateEnd;
	}

	public Date getDateStart() {
		return this.dateStart;
	}

	public void setDateStart(Date dateStart) {
		this.dateStart = dateStart;
	}

	public BigDecimal getDiscount() {
		return this.discount;
	}

	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}

	public byte getLogged() {
		return this.logged;
	}

	public void setLogged(byte logged) {
		this.logged = logged;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte getShipping() {
		return this.shipping;
	}

	public void setShipping(byte shipping) {
		this.shipping = shipping;
	}

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

	public BigDecimal getTotal() {
		return this.total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUsesCustomer() {
		return this.usesCustomer;
	}

	public void setUsesCustomer(String usesCustomer) {
		this.usesCustomer = usesCustomer;
	}

	public Integer getUsesTotal() {
		return this.usesTotal;
	}

	public void setUsesTotal(Integer usesTotal) {
		this.usesTotal = usesTotal;
	}

}
package com.megacart.domain.report;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the mc_product_discount database table.
 * 
 */
@Entity
@Table(name="mc_product_discount")
@NamedQuery(name="McProductDiscount.findAll", query="SELECT m FROM McProductDiscount m")
public class McProductDiscount implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="product_discount_id")
	private Integer productDiscountId;

	@Column(name="customer_group_id")
	private Integer customerGroupId;

	@Temporal(TemporalType.DATE)
	@Column(name="date_end")
	private Date dateEnd;

	@Temporal(TemporalType.DATE)
	@Column(name="date_start")
	private Date dateStart;

	private BigDecimal price;

	private Integer priority;

	@Column(name="product_id")
	private Integer productId;

	private Integer quantity;

	public McProductDiscount() {
	}

	public Integer getProductDiscountId() {
		return this.productDiscountId;
	}

	public void setProductDiscountId(Integer productDiscountId) {
		this.productDiscountId = productDiscountId;
	}

	public Integer getCustomerGroupId() {
		return this.customerGroupId;
	}

	public void setCustomerGroupId(Integer customerGroupId) {
		this.customerGroupId = customerGroupId;
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

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public Integer getProductId() {
		return this.productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

}
package com.megacart.domain.sale;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the mc_order_total database table.
 * 
 */
@Entity
@Table(name="mc_order_total")
@NamedQuery(name="McOrderTotal.findAll", query="SELECT m FROM McOrderTotal m")
public class McOrderTotal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="order_total_id")
	private Integer orderTotalId;

	private String code;

	@Column(name="order_id")
	private Integer orderId;

	@Column(name="sort_order")
	private Integer sortOrder;

	private String title;

	private BigDecimal value;

	public McOrderTotal() {
	}

	public Integer getOrderTotalId() {
		return this.orderTotalId;
	}

	public void setOrderTotalId(Integer orderTotalId) {
		this.orderTotalId = orderTotalId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(Integer sortOrder) {
		this.sortOrder = sortOrder;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public BigDecimal getValue() {
		return this.value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

}
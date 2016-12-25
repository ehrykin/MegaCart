package com.megacart.domain.sale;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the mc_order_product database table.
 * 
 */
@Entity
@Table(name="mc_order_product")
@NamedQuery(name="McOrderProduct.findAll", query="SELECT m FROM McOrderProduct m")
public class McOrderProduct implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="order_product_id")
	private Integer orderProductId;

	private String model;

	private String name;

	@Column(name="order_id")
	private Integer orderId;

	private BigDecimal price;

	@Column(name="product_id")
	private Integer productId;

	private Integer quantity;

	private Integer reward;

	private BigDecimal tax;

	private BigDecimal total;

	public McOrderProduct() {
	}

	public Integer getOrderProductId() {
		return this.orderProductId;
	}

	public void setOrderProductId(Integer orderProductId) {
		this.orderProductId = orderProductId;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
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

	public Integer getReward() {
		return this.reward;
	}

	public void setReward(Integer reward) {
		this.reward = reward;
	}

	public BigDecimal getTax() {
		return this.tax;
	}

	public void setTax(BigDecimal tax) {
		this.tax = tax;
	}

	public BigDecimal getTotal() {
		return this.total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

}
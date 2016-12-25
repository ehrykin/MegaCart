package com.megacart.domain.sale;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_order_option database table.
 * 
 */
@Entity
@Table(name="mc_order_option")
@NamedQuery(name="McOrderOption.findAll", query="SELECT m FROM McOrderOption m")
public class McOrderOption implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="order_option_id")
	private Integer orderOptionId;

	private String name;

	@Column(name="order_id")
	private Integer orderId;

	@Column(name="order_product_id")
	private Integer orderProductId;

	@Column(name="product_option_id")
	private Integer productOptionId;

	@Column(name="product_option_value_id")
	private Integer productOptionValueId;

	private String type;

	@Lob
	private String value;

	public McOrderOption() {
	}

	public Integer getOrderOptionId() {
		return this.orderOptionId;
	}

	public void setOrderOptionId(Integer orderOptionId) {
		this.orderOptionId = orderOptionId;
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

	public Integer getOrderProductId() {
		return this.orderProductId;
	}

	public void setOrderProductId(Integer orderProductId) {
		this.orderProductId = orderProductId;
	}

	public Integer getProductOptionId() {
		return this.productOptionId;
	}

	public void setProductOptionId(Integer productOptionId) {
		this.productOptionId = productOptionId;
	}

	public Integer getProductOptionValueId() {
		return this.productOptionValueId;
	}

	public void setProductOptionValueId(Integer productOptionValueId) {
		this.productOptionValueId = productOptionValueId;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
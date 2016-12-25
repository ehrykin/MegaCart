package com.megacart.domain.sale;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the mc_cart database table.
 * 
 */
@Entity
@Table(name="mc_cart")
@NamedQuery(name="McCart.findAll", query="SELECT m FROM McCart m")
public class McCart implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="cart_id")
	private Integer cartId;

	@Column(name="api_id")
	private Integer apiId;

	@Column(name="customer_id")
	private Integer customerId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_added")
	private Date dateAdded;

	@Lob
	private String option;

	@Column(name="product_id")
	private Integer productId;

	private Integer quantity;

	@Column(name="recurring_id")
	private Integer recurringId;

	@Column(name="session_id")
	private String sessionId;

	public McCart() {
	}

	public Integer getCartId() {
		return this.cartId;
	}

	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}

	public Integer getApiId() {
		return this.apiId;
	}

	public void setApiId(Integer apiId) {
		this.apiId = apiId;
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

	public String getOption() {
		return this.option;
	}

	public void setOption(String option) {
		this.option = option;
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

	public Integer getRecurringId() {
		return this.recurringId;
	}

	public void setRecurringId(Integer recurringId) {
		this.recurringId = recurringId;
	}

	public String getSessionId() {
		return this.sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

}
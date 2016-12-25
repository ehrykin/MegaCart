package com.megacart.domain.report;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the mc_customer_transaction database table.
 * 
 */
@Entity
@Table(name="mc_customer_transaction")
@NamedQuery(name="McCustomerTransaction.findAll", query="SELECT m FROM McCustomerTransaction m")
public class McCustomerTransaction implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="customer_transaction_id")
	private Integer customerTransactionId;

	private BigDecimal amount;

	@Column(name="customer_id")
	private Integer customerId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_added")
	private Date dateAdded;

	@Lob
	private String description;

	@Column(name="order_id")
	private Integer orderId;

	public McCustomerTransaction() {
	}

	public Integer getCustomerTransactionId() {
		return this.customerTransactionId;
	}

	public void setCustomerTransactionId(Integer customerTransactionId) {
		this.customerTransactionId = customerTransactionId;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

}
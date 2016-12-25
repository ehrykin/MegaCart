package com.megacart.domain.sale;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the mc_order_recurring_transaction database table.
 * 
 */
@Entity
@Table(name="mc_order_recurring_transaction")
@NamedQuery(name="McOrderRecurringTransaction.findAll", query="SELECT m FROM McOrderRecurringTransaction m")
public class McOrderRecurringTransaction implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="order_recurring_transaction_id")
	private Integer orderRecurringTransactionId;

	private BigDecimal amount;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_added")
	private Date dateAdded;

	@Column(name="order_recurring_id")
	private Integer orderRecurringId;

	private String reference;

	private String type;

	public McOrderRecurringTransaction() {
	}

	public Integer getOrderRecurringTransactionId() {
		return this.orderRecurringTransactionId;
	}

	public void setOrderRecurringTransactionId(Integer orderRecurringTransactionId) {
		this.orderRecurringTransactionId = orderRecurringTransactionId;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Date getDateAdded() {
		return this.dateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}

	public Integer getOrderRecurringId() {
		return this.orderRecurringId;
	}

	public void setOrderRecurringId(Integer orderRecurringId) {
		this.orderRecurringId = orderRecurringId;
	}

	public String getReference() {
		return this.reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
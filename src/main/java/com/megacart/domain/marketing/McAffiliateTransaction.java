package com.megacart.domain.marketing;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the mc_affiliate_transaction database table.
 * 
 */
@Entity
@Table(name="mc_affiliate_transaction")
@NamedQuery(name="McAffiliateTransaction.findAll", query="SELECT m FROM McAffiliateTransaction m")
public class McAffiliateTransaction implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="affiliate_transaction_id")
	private Integer affiliateTransactionId;

	@Column(name="affiliate_id")
	private Integer affiliateId;

	private BigDecimal amount;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_added")
	private Date dateAdded;

	@Lob
	private String description;

	@Column(name="order_id")
	private Integer orderId;

	public McAffiliateTransaction() {
	}

	public Integer getAffiliateTransactionId() {
		return this.affiliateTransactionId;
	}

	public void setAffiliateTransactionId(Integer affiliateTransactionId) {
		this.affiliateTransactionId = affiliateTransactionId;
	}

	public Integer getAffiliateId() {
		return this.affiliateId;
	}

	public void setAffiliateId(Integer affiliateId) {
		this.affiliateId = affiliateId;
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
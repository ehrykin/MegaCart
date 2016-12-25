package com.megacart.domain.report;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the mc_customer_history database table.
 * 
 */
@Entity
@Table(name="mc_customer_history")
@NamedQuery(name="McCustomerHistory.findAll", query="SELECT m FROM McCustomerHistory m")
public class McCustomerHistory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="customer_history_id")
	private Integer customerHistoryId;

	@Lob
	private String comment;

	@Column(name="customer_id")
	private Integer customerId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_added")
	private Date dateAdded;

	public McCustomerHistory() {
	}

	public Integer getCustomerHistoryId() {
		return this.customerHistoryId;
	}

	public void setCustomerHistoryId(Integer customerHistoryId) {
		this.customerHistoryId = customerHistoryId;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
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

}
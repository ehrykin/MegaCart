package com.megacart.domain.sale;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the mc_order_history database table.
 * 
 */
@Entity
@Table(name="mc_order_history")
@NamedQuery(name="McOrderHistory.findAll", query="SELECT m FROM McOrderHistory m")
public class McOrderHistory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="order_history_id")
	private Integer orderHistoryId;

	@Lob
	private String comment;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_added")
	private Date dateAdded;

	private byte notify;

	@Column(name="order_id")
	private Integer orderId;

	@Column(name="order_status_id")
	private Integer orderStatusId;

	public McOrderHistory() {
	}

	public Integer getOrderHistoryId() {
		return this.orderHistoryId;
	}

	public void setOrderHistoryId(Integer orderHistoryId) {
		this.orderHistoryId = orderHistoryId;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Date getDateAdded() {
		return this.dateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}

	public byte getNotify() {
		return this.notify;
	}

	public void setNotify(byte notify) {
		this.notify = notify;
	}

	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getOrderStatusId() {
		return this.orderStatusId;
	}

	public void setOrderStatusId(Integer orderStatusId) {
		this.orderStatusId = orderStatusId;
	}

}
package com.megacart.domain.report;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the mc_customer_reward database table.
 * 
 */
@Entity
@Table(name="mc_customer_reward")
@NamedQuery(name="McCustomerReward.findAll", query="SELECT m FROM McCustomerReward m")
public class McCustomerReward implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="customer_reward_id")
	private Integer customerRewardId;

	@Column(name="customer_id")
	private Integer customerId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_added")
	private Date dateAdded;

	@Lob
	private String description;

	@Column(name="order_id")
	private Integer orderId;

	private Integer points;

	public McCustomerReward() {
	}

	public Integer getCustomerRewardId() {
		return this.customerRewardId;
	}

	public void setCustomerRewardId(Integer customerRewardId) {
		this.customerRewardId = customerRewardId;
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

	public Integer getPoints() {
		return this.points;
	}

	public void setPoints(Integer points) {
		this.points = points;
	}

}
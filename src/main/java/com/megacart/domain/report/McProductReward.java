package com.megacart.domain.report;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_product_reward database table.
 * 
 */
@Entity
@Table(name="mc_product_reward")
@NamedQuery(name="McProductReward.findAll", query="SELECT m FROM McProductReward m")
public class McProductReward implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="product_reward_id")
	private Integer productRewardId;

	@Column(name="customer_group_id")
	private Integer customerGroupId;

	private Integer points;

	@Column(name="product_id")
	private Integer productId;

	public McProductReward() {
	}

	public Integer getProductRewardId() {
		return this.productRewardId;
	}

	public void setProductRewardId(Integer productRewardId) {
		this.productRewardId = productRewardId;
	}

	public Integer getCustomerGroupId() {
		return this.customerGroupId;
	}

	public void setCustomerGroupId(Integer customerGroupId) {
		this.customerGroupId = customerGroupId;
	}

	public Integer getPoints() {
		return this.points;
	}

	public void setPoints(Integer points) {
		this.points = points;
	}

	public Integer getProductId() {
		return this.productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

}
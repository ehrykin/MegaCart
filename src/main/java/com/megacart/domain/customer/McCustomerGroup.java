package com.megacart.domain.customer;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_customer_group database table.
 * 
 */
@Entity
@Table(name="mc_customer_group")
@NamedQuery(name="McCustomerGroup.findAll", query="SELECT m FROM McCustomerGroup m")
public class McCustomerGroup implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="customer_group_id")
	private Integer customerGroupId;

	private Integer approval;

	@Column(name="sort_order")
	private Integer sortOrder;

	public McCustomerGroup() {
	}

	public Integer getCustomerGroupId() {
		return this.customerGroupId;
	}

	public void setCustomerGroupId(Integer customerGroupId) {
		this.customerGroupId = customerGroupId;
	}

	public Integer getApproval() {
		return this.approval;
	}

	public void setApproval(Integer approval) {
		this.approval = approval;
	}

	public Integer getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(Integer sortOrder) {
		this.sortOrder = sortOrder;
	}

}
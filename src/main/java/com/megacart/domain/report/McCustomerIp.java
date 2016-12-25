package com.megacart.domain.report;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the mc_customer_ip database table.
 * 
 */
@Entity
@Table(name="mc_customer_ip")
@NamedQuery(name="McCustomerIp.findAll", query="SELECT m FROM McCustomerIp m")
public class McCustomerIp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="customer_ip_id")
	private Integer customerIpId;

	@Column(name="customer_id")
	private Integer customerId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_added")
	private Date dateAdded;

	private String ip;

	public McCustomerIp() {
	}

	public Integer getCustomerIpId() {
		return this.customerIpId;
	}

	public void setCustomerIpId(Integer customerIpId) {
		this.customerIpId = customerIpId;
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

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

}
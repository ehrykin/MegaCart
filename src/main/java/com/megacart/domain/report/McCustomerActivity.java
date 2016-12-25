package com.megacart.domain.report;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the mc_customer_activity database table.
 * 
 */
@Entity
@Table(name="mc_customer_activity")
@NamedQuery(name="McCustomerActivity.findAll", query="SELECT m FROM McCustomerActivity m")
public class McCustomerActivity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="customer_activity_id")
	private Integer customerActivityId;

	@Column(name="customer_id")
	private Integer customerId;

	@Lob
	private String data;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_added")
	private Date dateAdded;

	private String ip;

	private String key;

	public McCustomerActivity() {
	}

	public Integer getCustomerActivityId() {
		return this.customerActivityId;
	}

	public void setCustomerActivityId(Integer customerActivityId) {
		this.customerActivityId = customerActivityId;
	}

	public Integer getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
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

	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
	}

}
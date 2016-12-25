package com.megacart.domain.marketing;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the mc_affiliate_activity database table.
 * 
 */
@Entity
@Table(name="mc_affiliate_activity")
@NamedQuery(name="McAffiliateActivity.findAll", query="SELECT m FROM McAffiliateActivity m")
public class McAffiliateActivity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="affiliate_activity_id")
	private Integer affiliateActivityId;

	@Column(name="affiliate_id")
	private Integer affiliateId;

	@Lob
	private String data;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_added")
	private Date dateAdded;

	private String ip;

	private String key;

	public McAffiliateActivity() {
	}

	public Integer getAffiliateActivityId() {
		return this.affiliateActivityId;
	}

	public void setAffiliateActivityId(Integer affiliateActivityId) {
		this.affiliateActivityId = affiliateActivityId;
	}

	public Integer getAffiliateId() {
		return this.affiliateId;
	}

	public void setAffiliateId(Integer affiliateId) {
		this.affiliateId = affiliateId;
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
package com.megacart.domain.marketing;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the mc_affiliate_login database table.
 * 
 */
@Entity
@Table(name="mc_affiliate_login")
@NamedQuery(name="McAffiliateLogin.findAll", query="SELECT m FROM McAffiliateLogin m")
public class McAffiliateLogin implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="affiliate_login_id")
	private Integer affiliateLoginId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_added")
	private Date dateAdded;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_modified")
	private Date dateModified;

	private String email;

	private String ip;

	private Integer total;

	public McAffiliateLogin() {
	}

	public Integer getAffiliateLoginId() {
		return this.affiliateLoginId;
	}

	public void setAffiliateLoginId(Integer affiliateLoginId) {
		this.affiliateLoginId = affiliateLoginId;
	}

	public Date getDateAdded() {
		return this.dateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}

	public Date getDateModified() {
		return this.dateModified;
	}

	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

}
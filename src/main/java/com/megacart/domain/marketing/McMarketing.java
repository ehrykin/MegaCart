package com.megacart.domain.marketing;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the mc_marketing database table.
 * 
 */
@Entity
@Table(name="mc_marketing")
@NamedQuery(name="McMarketing.findAll", query="SELECT m FROM McMarketing m")
public class McMarketing implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="marketing_id")
	private Integer marketingId;

	private Integer clicks;

	private String code;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_added")
	private Date dateAdded;

	@Lob
	private String description;

	private String name;

	public McMarketing() {
	}

	public Integer getMarketingId() {
		return this.marketingId;
	}

	public void setMarketingId(Integer marketingId) {
		this.marketingId = marketingId;
	}

	public Integer getClicks() {
		return this.clicks;
	}

	public void setClicks(Integer clicks) {
		this.clicks = clicks;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
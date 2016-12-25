package com.megacart.domain.design;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the mc_tax_rate database table.
 * 
 */
@Entity
@Table(name="mc_tax_rate")
@NamedQuery(name="McTaxRate.findAll", query="SELECT m FROM McTaxRate m")
public class McTaxRate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="tax_rate_id")
	private Integer taxRateId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_added")
	private Date dateAdded;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_modified")
	private Date dateModified;

	@Column(name="geo_zone_id")
	private Integer geoZoneId;

	private String name;

	private BigDecimal rate;

	private String type;

	public McTaxRate() {
	}

	public Integer getTaxRateId() {
		return this.taxRateId;
	}

	public void setTaxRateId(Integer taxRateId) {
		this.taxRateId = taxRateId;
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

	public Integer getGeoZoneId() {
		return this.geoZoneId;
	}

	public void setGeoZoneId(Integer geoZoneId) {
		this.geoZoneId = geoZoneId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getRate() {
		return this.rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
package com.megacart.domain.localisation;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_zone database table.
 * 
 */
@Entity
@Table(name="mc_zone")
@NamedQuery(name="McZone.findAll", query="SELECT m FROM McZone m")
public class McZone implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="zone_id")
	private Integer zoneId;

	private String code;

	@Column(name="country_id")
	private Integer countryId;

	private String name;

	private byte status;

	public McZone() {
	}

	public Integer getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(Integer zoneId) {
		this.zoneId = zoneId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getCountryId() {
		return this.countryId;
	}

	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

}
package com.megacart.domain.localisation;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_country database table.
 * 
 */
@Entity
@Table(name="mc_country")
@NamedQuery(name="McCountry.findAll", query="SELECT m FROM McCountry m")
public class McCountry implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="country_id")
	private Integer countryId;

	@Lob
	@Column(name="address_format")
	private String addressFormat;

	@Column(name="iso_code_2")
	private String isoCode2;

	@Column(name="iso_code_3")
	private String isoCode3;

	private String name;

	@Column(name="postcode_required")
	private byte postcodeRequired;

	private byte status;

	public McCountry() {
	}

	public Integer getCountryId() {
		return this.countryId;
	}

	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}

	public String getAddressFormat() {
		return this.addressFormat;
	}

	public void setAddressFormat(String addressFormat) {
		this.addressFormat = addressFormat;
	}

	public String getIsoCode2() {
		return this.isoCode2;
	}

	public void setIsoCode2(String isoCode2) {
		this.isoCode2 = isoCode2;
	}

	public String getIsoCode3() {
		return this.isoCode3;
	}

	public void setIsoCode3(String isoCode3) {
		this.isoCode3 = isoCode3;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte getPostcodeRequired() {
		return this.postcodeRequired;
	}

	public void setPostcodeRequired(byte postcodeRequired) {
		this.postcodeRequired = postcodeRequired;
	}

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

}
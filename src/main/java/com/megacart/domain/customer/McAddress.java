package com.megacart.domain.customer;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_address database table.
 * 
 */
@Entity
@Table(name="mc_address")
@NamedQuery(name="McAddress.findAll", query="SELECT m FROM McAddress m")
public class McAddress implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="address_id")
	private Integer addressId;

	@Column(name="address_1")
	private String address1;

	@Column(name="address_2")
	private String address2;

	private String city;

	private String company;

	@Column(name="country_id")
	private Integer countryId;

	@Lob
	@Column(name="custom_field")
	private String customField;

	@Column(name="customer_id")
	private Integer customerId;

	private String firstname;

	private String lastname;

	private String postcode;

	@Column(name="zone_id")
	private Integer zoneId;

	public McAddress() {
	}

	public Integer getAddressId() {
		return this.addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public String getAddress1() {
		return this.address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return this.address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCompany() {
		return this.company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Integer getCountryId() {
		return this.countryId;
	}

	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}

	public String getCustomField() {
		return this.customField;
	}

	public void setCustomField(String customField) {
		this.customField = customField;
	}

	public Integer getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPostcode() {
		return this.postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public Integer getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(Integer zoneId) {
		this.zoneId = zoneId;
	}

}
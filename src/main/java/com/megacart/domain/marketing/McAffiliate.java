package com.megacart.domain.marketing;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the mc_affiliate database table.
 * 
 */
@Entity
@Table(name="mc_affiliate")
@NamedQuery(name="McAffiliate.findAll", query="SELECT m FROM McAffiliate m")
public class McAffiliate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="affiliate_id")
	private Integer affiliateId;

	@Column(name="address_1")
	private String address1;

	@Column(name="address_2")
	private String address2;

	private byte approved;

	@Column(name="bank_account_name")
	private String bankAccountName;

	@Column(name="bank_account_number")
	private String bankAccountNumber;

	@Column(name="bank_branch_number")
	private String bankBranchNumber;

	@Column(name="bank_name")
	private String bankName;

	@Column(name="bank_swift_code")
	private String bankSwiftCode;

	private String cheque;

	private String city;

	private String code;

	private BigDecimal commission;

	private String company;

	@Column(name="country_id")
	private Integer countryId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_added")
	private Date dateAdded;

	private String email;

	private String fax;

	private String firstname;

	private String ip;

	private String lastname;

	private String password;

	private String payment;

	private String paypal;

	private String postcode;

	private String salt;

	private byte status;

	private String tax;

	private String telephone;

	private String website;

	@Column(name="zone_id")
	private Integer zoneId;

	public McAffiliate() {
	}

	public Integer getAffiliateId() {
		return this.affiliateId;
	}

	public void setAffiliateId(Integer affiliateId) {
		this.affiliateId = affiliateId;
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

	public byte getApproved() {
		return this.approved;
	}

	public void setApproved(byte approved) {
		this.approved = approved;
	}

	public String getBankAccountName() {
		return this.bankAccountName;
	}

	public void setBankAccountName(String bankAccountName) {
		this.bankAccountName = bankAccountName;
	}

	public String getBankAccountNumber() {
		return this.bankAccountNumber;
	}

	public void setBankAccountNumber(String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	public String getBankBranchNumber() {
		return this.bankBranchNumber;
	}

	public void setBankBranchNumber(String bankBranchNumber) {
		this.bankBranchNumber = bankBranchNumber;
	}

	public String getBankName() {
		return this.bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankSwiftCode() {
		return this.bankSwiftCode;
	}

	public void setBankSwiftCode(String bankSwiftCode) {
		this.bankSwiftCode = bankSwiftCode;
	}

	public String getCheque() {
		return this.cheque;
	}

	public void setCheque(String cheque) {
		this.cheque = cheque;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public BigDecimal getCommission() {
		return this.commission;
	}

	public void setCommission(BigDecimal commission) {
		this.commission = commission;
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

	public Date getDateAdded() {
		return this.dateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPayment() {
		return this.payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public String getPaypal() {
		return this.paypal;
	}

	public void setPaypal(String paypal) {
		this.paypal = paypal;
	}

	public String getPostcode() {
		return this.postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getSalt() {
		return this.salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

	public String getTax() {
		return this.tax;
	}

	public void setTax(String tax) {
		this.tax = tax;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getWebsite() {
		return this.website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public Integer getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(Integer zoneId) {
		this.zoneId = zoneId;
	}

}
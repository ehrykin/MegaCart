package com.megacart.domain.customer;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the mc_customer database table.
 * 
 */
@Entity
@Table(name="mc_customer")
@NamedQuery(name="McCustomer.findAll", query="SELECT m FROM McCustomer m")
public class McCustomer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="customer_id")
	private Integer customerId;

	@Column(name="address_id")
	private Integer addressId;

	private byte approved;

	@Lob
	private String cart;

	private String code;

	@Lob
	@Column(name="custom_field")
	private String customField;

	@Column(name="customer_group_id")
	private Integer customerGroupId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_added")
	private Date dateAdded;

	private String email;

	private String fax;

	private String firstname;

	private String ip;

	@Column(name="language_id")
	private Integer languageId;

	private String lastname;

	private byte newsletter;

	private String password;

	private byte safe;

	private String salt;

	private byte status;

	@Column(name="store_id")
	private Integer storeId;

	private String telephone;

	@Lob
	private String token;

	@Lob
	private String wishlist;

	public McCustomer() {
	}

	public Integer getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Integer getAddressId() {
		return this.addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public byte getApproved() {
		return this.approved;
	}

	public void setApproved(byte approved) {
		this.approved = approved;
	}

	public String getCart() {
		return this.cart;
	}

	public void setCart(String cart) {
		this.cart = cart;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCustomField() {
		return this.customField;
	}

	public void setCustomField(String customField) {
		this.customField = customField;
	}

	public Integer getCustomerGroupId() {
		return this.customerGroupId;
	}

	public void setCustomerGroupId(Integer customerGroupId) {
		this.customerGroupId = customerGroupId;
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

	public Integer getLanguageId() {
		return this.languageId;
	}

	public void setLanguageId(Integer languageId) {
		this.languageId = languageId;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public byte getNewsletter() {
		return this.newsletter;
	}

	public void setNewsletter(byte newsletter) {
		this.newsletter = newsletter;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public byte getSafe() {
		return this.safe;
	}

	public void setSafe(byte safe) {
		this.safe = safe;
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

	public Integer getStoreId() {
		return this.storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getWishlist() {
		return this.wishlist;
	}

	public void setWishlist(String wishlist) {
		this.wishlist = wishlist;
	}

}
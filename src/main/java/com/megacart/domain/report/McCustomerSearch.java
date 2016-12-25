package com.megacart.domain.report;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the mc_customer_search database table.
 * 
 */
@Entity
@Table(name="mc_customer_search")
@NamedQuery(name="McCustomerSearch.findAll", query="SELECT m FROM McCustomerSearch m")
public class McCustomerSearch implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="customer_search_id")
	private Integer customerSearchId;

	@Column(name="category_id")
	private Integer categoryId;

	@Column(name="customer_id")
	private Integer customerId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_added")
	private Date dateAdded;

	private byte description;

	private String ip;

	private String keyword;

	@Column(name="language_id")
	private Integer languageId;

	private Integer products;

	@Column(name="store_id")
	private Integer storeId;

	@Column(name="sub_category")
	private byte subCategory;

	public McCustomerSearch() {
	}

	public Integer getCustomerSearchId() {
		return this.customerSearchId;
	}

	public void setCustomerSearchId(Integer customerSearchId) {
		this.customerSearchId = customerSearchId;
	}

	public Integer getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public Integer getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Date getDateAdded() {
		return this.dateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}

	public byte getDescription() {
		return this.description;
	}

	public void setDescription(byte description) {
		this.description = description;
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public Integer getLanguageId() {
		return this.languageId;
	}

	public void setLanguageId(Integer languageId) {
		this.languageId = languageId;
	}

	public Integer getProducts() {
		return this.products;
	}

	public void setProducts(Integer products) {
		this.products = products;
	}

	public Integer getStoreId() {
		return this.storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

	public byte getSubCategory() {
		return this.subCategory;
	}

	public void setSubCategory(byte subCategory) {
		this.subCategory = subCategory;
	}

}
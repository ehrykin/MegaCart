package com.megacart.domain.sale;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the mc_order database table.
 * 
 */
@Entity
@Table(name="mc_order")
@NamedQuery(name="McOrder.findAll", query="SELECT m FROM McOrder m")
public class McOrder implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="order_id")
	private Integer orderId;

	@Column(name="accept_language")
	private String acceptLanguage;

	@Column(name="affiliate_id")
	private Integer affiliateId;

	@Lob
	private String comment;

	private BigDecimal commission;

	@Column(name="currency_code")
	private String currencyCode;

	@Column(name="currency_id")
	private Integer currencyId;

	@Column(name="currency_value")
	private BigDecimal currencyValue;

	@Lob
	@Column(name="custom_field")
	private String customField;

	@Column(name="customer_group_id")
	private Integer customerGroupId;

	@Column(name="customer_id")
	private Integer customerId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_added")
	private Date dateAdded;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_modified")
	private Date dateModified;

	private String email;

	private String fax;

	private String firstname;

	@Column(name="forwarded_ip")
	private String forwardedIp;

	@Column(name="invoice_no")
	private Integer invoiceNo;

	@Column(name="invoice_prefix")
	private String invoicePrefix;

	private String ip;

	@Column(name="language_id")
	private Integer languageId;

	private String lastname;

	@Column(name="marketing_id")
	private Integer marketingId;

	@Column(name="order_status_id")
	private Integer orderStatusId;

	@Column(name="payment_address_1")
	private String paymentAddress1;

	@Column(name="payment_address_2")
	private String paymentAddress2;

	@Lob
	@Column(name="payment_address_format")
	private String paymentAddressFormat;

	@Column(name="payment_city")
	private String paymentCity;

	@Column(name="payment_code")
	private String paymentCode;

	@Column(name="payment_company")
	private String paymentCompany;

	@Column(name="payment_country")
	private String paymentCountry;

	@Column(name="payment_country_id")
	private Integer paymentCountryId;

	@Lob
	@Column(name="payment_custom_field")
	private String paymentCustomField;

	@Column(name="payment_firstname")
	private String paymentFirstname;

	@Column(name="payment_lastname")
	private String paymentLastname;

	@Column(name="payment_method")
	private String paymentMethod;

	@Column(name="payment_postcode")
	private String paymentPostcode;

	@Column(name="payment_zone")
	private String paymentZone;

	@Column(name="payment_zone_id")
	private Integer paymentZoneId;

	@Column(name="shipping_address_1")
	private String shippingAddress1;

	@Column(name="shipping_address_2")
	private String shippingAddress2;

	@Lob
	@Column(name="shipping_address_format")
	private String shippingAddressFormat;

	@Column(name="shipping_city")
	private String shippingCity;

	@Column(name="shipping_code")
	private String shippingCode;

	@Column(name="shipping_company")
	private String shippingCompany;

	@Column(name="shipping_country")
	private String shippingCountry;

	@Column(name="shipping_country_id")
	private Integer shippingCountryId;

	@Lob
	@Column(name="shipping_custom_field")
	private String shippingCustomField;

	@Column(name="shipping_firstname")
	private String shippingFirstname;

	@Column(name="shipping_lastname")
	private String shippingLastname;

	@Column(name="shipping_method")
	private String shippingMethod;

	@Column(name="shipping_postcode")
	private String shippingPostcode;

	@Column(name="shipping_zone")
	private String shippingZone;

	@Column(name="shipping_zone_id")
	private Integer shippingZoneId;

	@Column(name="store_id")
	private Integer storeId;

	@Column(name="store_name")
	private String storeName;

	@Column(name="store_url")
	private String storeUrl;

	private String telephone;

	private BigDecimal total;

	private String tracking;

	@Column(name="user_agent")
	private String userAgent;

	public McOrder() {
	}

	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getAcceptLanguage() {
		return this.acceptLanguage;
	}

	public void setAcceptLanguage(String acceptLanguage) {
		this.acceptLanguage = acceptLanguage;
	}

	public Integer getAffiliateId() {
		return this.affiliateId;
	}

	public void setAffiliateId(Integer affiliateId) {
		this.affiliateId = affiliateId;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public BigDecimal getCommission() {
		return this.commission;
	}

	public void setCommission(BigDecimal commission) {
		this.commission = commission;
	}

	public String getCurrencyCode() {
		return this.currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public Integer getCurrencyId() {
		return this.currencyId;
	}

	public void setCurrencyId(Integer currencyId) {
		this.currencyId = currencyId;
	}

	public BigDecimal getCurrencyValue() {
		return this.currencyValue;
	}

	public void setCurrencyValue(BigDecimal currencyValue) {
		this.currencyValue = currencyValue;
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

	public String getForwardedIp() {
		return this.forwardedIp;
	}

	public void setForwardedIp(String forwardedIp) {
		this.forwardedIp = forwardedIp;
	}

	public Integer getInvoiceNo() {
		return this.invoiceNo;
	}

	public void setInvoiceNo(Integer invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public String getInvoicePrefix() {
		return this.invoicePrefix;
	}

	public void setInvoicePrefix(String invoicePrefix) {
		this.invoicePrefix = invoicePrefix;
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

	public Integer getMarketingId() {
		return this.marketingId;
	}

	public void setMarketingId(Integer marketingId) {
		this.marketingId = marketingId;
	}

	public Integer getOrderStatusId() {
		return this.orderStatusId;
	}

	public void setOrderStatusId(Integer orderStatusId) {
		this.orderStatusId = orderStatusId;
	}

	public String getPaymentAddress1() {
		return this.paymentAddress1;
	}

	public void setPaymentAddress1(String paymentAddress1) {
		this.paymentAddress1 = paymentAddress1;
	}

	public String getPaymentAddress2() {
		return this.paymentAddress2;
	}

	public void setPaymentAddress2(String paymentAddress2) {
		this.paymentAddress2 = paymentAddress2;
	}

	public String getPaymentAddressFormat() {
		return this.paymentAddressFormat;
	}

	public void setPaymentAddressFormat(String paymentAddressFormat) {
		this.paymentAddressFormat = paymentAddressFormat;
	}

	public String getPaymentCity() {
		return this.paymentCity;
	}

	public void setPaymentCity(String paymentCity) {
		this.paymentCity = paymentCity;
	}

	public String getPaymentCode() {
		return this.paymentCode;
	}

	public void setPaymentCode(String paymentCode) {
		this.paymentCode = paymentCode;
	}

	public String getPaymentCompany() {
		return this.paymentCompany;
	}

	public void setPaymentCompany(String paymentCompany) {
		this.paymentCompany = paymentCompany;
	}

	public String getPaymentCountry() {
		return this.paymentCountry;
	}

	public void setPaymentCountry(String paymentCountry) {
		this.paymentCountry = paymentCountry;
	}

	public Integer getPaymentCountryId() {
		return this.paymentCountryId;
	}

	public void setPaymentCountryId(Integer paymentCountryId) {
		this.paymentCountryId = paymentCountryId;
	}

	public String getPaymentCustomField() {
		return this.paymentCustomField;
	}

	public void setPaymentCustomField(String paymentCustomField) {
		this.paymentCustomField = paymentCustomField;
	}

	public String getPaymentFirstname() {
		return this.paymentFirstname;
	}

	public void setPaymentFirstname(String paymentFirstname) {
		this.paymentFirstname = paymentFirstname;
	}

	public String getPaymentLastname() {
		return this.paymentLastname;
	}

	public void setPaymentLastname(String paymentLastname) {
		this.paymentLastname = paymentLastname;
	}

	public String getPaymentMethod() {
		return this.paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getPaymentPostcode() {
		return this.paymentPostcode;
	}

	public void setPaymentPostcode(String paymentPostcode) {
		this.paymentPostcode = paymentPostcode;
	}

	public String getPaymentZone() {
		return this.paymentZone;
	}

	public void setPaymentZone(String paymentZone) {
		this.paymentZone = paymentZone;
	}

	public Integer getPaymentZoneId() {
		return this.paymentZoneId;
	}

	public void setPaymentZoneId(Integer paymentZoneId) {
		this.paymentZoneId = paymentZoneId;
	}

	public String getShippingAddress1() {
		return this.shippingAddress1;
	}

	public void setShippingAddress1(String shippingAddress1) {
		this.shippingAddress1 = shippingAddress1;
	}

	public String getShippingAddress2() {
		return this.shippingAddress2;
	}

	public void setShippingAddress2(String shippingAddress2) {
		this.shippingAddress2 = shippingAddress2;
	}

	public String getShippingAddressFormat() {
		return this.shippingAddressFormat;
	}

	public void setShippingAddressFormat(String shippingAddressFormat) {
		this.shippingAddressFormat = shippingAddressFormat;
	}

	public String getShippingCity() {
		return this.shippingCity;
	}

	public void setShippingCity(String shippingCity) {
		this.shippingCity = shippingCity;
	}

	public String getShippingCode() {
		return this.shippingCode;
	}

	public void setShippingCode(String shippingCode) {
		this.shippingCode = shippingCode;
	}

	public String getShippingCompany() {
		return this.shippingCompany;
	}

	public void setShippingCompany(String shippingCompany) {
		this.shippingCompany = shippingCompany;
	}

	public String getShippingCountry() {
		return this.shippingCountry;
	}

	public void setShippingCountry(String shippingCountry) {
		this.shippingCountry = shippingCountry;
	}

	public Integer getShippingCountryId() {
		return this.shippingCountryId;
	}

	public void setShippingCountryId(Integer shippingCountryId) {
		this.shippingCountryId = shippingCountryId;
	}

	public String getShippingCustomField() {
		return this.shippingCustomField;
	}

	public void setShippingCustomField(String shippingCustomField) {
		this.shippingCustomField = shippingCustomField;
	}

	public String getShippingFirstname() {
		return this.shippingFirstname;
	}

	public void setShippingFirstname(String shippingFirstname) {
		this.shippingFirstname = shippingFirstname;
	}

	public String getShippingLastname() {
		return this.shippingLastname;
	}

	public void setShippingLastname(String shippingLastname) {
		this.shippingLastname = shippingLastname;
	}

	public String getShippingMethod() {
		return this.shippingMethod;
	}

	public void setShippingMethod(String shippingMethod) {
		this.shippingMethod = shippingMethod;
	}

	public String getShippingPostcode() {
		return this.shippingPostcode;
	}

	public void setShippingPostcode(String shippingPostcode) {
		this.shippingPostcode = shippingPostcode;
	}

	public String getShippingZone() {
		return this.shippingZone;
	}

	public void setShippingZone(String shippingZone) {
		this.shippingZone = shippingZone;
	}

	public Integer getShippingZoneId() {
		return this.shippingZoneId;
	}

	public void setShippingZoneId(Integer shippingZoneId) {
		this.shippingZoneId = shippingZoneId;
	}

	public Integer getStoreId() {
		return this.storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

	public String getStoreName() {
		return this.storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getStoreUrl() {
		return this.storeUrl;
	}

	public void setStoreUrl(String storeUrl) {
		this.storeUrl = storeUrl;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public BigDecimal getTotal() {
		return this.total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public String getTracking() {
		return this.tracking;
	}

	public void setTracking(String tracking) {
		this.tracking = tracking;
	}

	public String getUserAgent() {
		return this.userAgent;
	}

	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}

}
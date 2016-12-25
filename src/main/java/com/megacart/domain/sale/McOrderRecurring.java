package com.megacart.domain.sale;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the mc_order_recurring database table.
 * 
 */
@Entity
@Table(name="mc_order_recurring")
@NamedQuery(name="McOrderRecurring.findAll", query="SELECT m FROM McOrderRecurring m")
public class McOrderRecurring implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="order_recurring_id")
	private Integer orderRecurringId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_added")
	private Date dateAdded;

	@Column(name="order_id")
	private Integer orderId;

	@Column(name="product_id")
	private Integer productId;

	@Column(name="product_name")
	private String productName;

	@Column(name="product_quantity")
	private Integer productQuantity;

	@Column(name="recurring_cycle")
	private short recurringCycle;

	@Column(name="recurring_description")
	private String recurringDescription;

	@Column(name="recurring_duration")
	private short recurringDuration;

	@Column(name="recurring_frequency")
	private String recurringFrequency;

	@Column(name="recurring_id")
	private Integer recurringId;

	@Column(name="recurring_name")
	private String recurringName;

	@Column(name="recurring_price")
	private BigDecimal recurringPrice;

	private String reference;

	private byte status;

	private byte trial;

	@Column(name="trial_cycle")
	private short trialCycle;

	@Column(name="trial_duration")
	private short trialDuration;

	@Column(name="trial_frequency")
	private String trialFrequency;

	@Column(name="trial_price")
	private BigDecimal trialPrice;

	public McOrderRecurring() {
	}

	public Integer getOrderRecurringId() {
		return this.orderRecurringId;
	}

	public void setOrderRecurringId(Integer orderRecurringId) {
		this.orderRecurringId = orderRecurringId;
	}

	public Date getDateAdded() {
		return this.dateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}

	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getProductId() {
		return this.productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getProductQuantity() {
		return this.productQuantity;
	}

	public void setProductQuantity(Integer productQuantity) {
		this.productQuantity = productQuantity;
	}

	public short getRecurringCycle() {
		return this.recurringCycle;
	}

	public void setRecurringCycle(short recurringCycle) {
		this.recurringCycle = recurringCycle;
	}

	public String getRecurringDescription() {
		return this.recurringDescription;
	}

	public void setRecurringDescription(String recurringDescription) {
		this.recurringDescription = recurringDescription;
	}

	public short getRecurringDuration() {
		return this.recurringDuration;
	}

	public void setRecurringDuration(short recurringDuration) {
		this.recurringDuration = recurringDuration;
	}

	public String getRecurringFrequency() {
		return this.recurringFrequency;
	}

	public void setRecurringFrequency(String recurringFrequency) {
		this.recurringFrequency = recurringFrequency;
	}

	public Integer getRecurringId() {
		return this.recurringId;
	}

	public void setRecurringId(Integer recurringId) {
		this.recurringId = recurringId;
	}

	public String getRecurringName() {
		return this.recurringName;
	}

	public void setRecurringName(String recurringName) {
		this.recurringName = recurringName;
	}

	public BigDecimal getRecurringPrice() {
		return this.recurringPrice;
	}

	public void setRecurringPrice(BigDecimal recurringPrice) {
		this.recurringPrice = recurringPrice;
	}

	public String getReference() {
		return this.reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

	public byte getTrial() {
		return this.trial;
	}

	public void setTrial(byte trial) {
		this.trial = trial;
	}

	public short getTrialCycle() {
		return this.trialCycle;
	}

	public void setTrialCycle(short trialCycle) {
		this.trialCycle = trialCycle;
	}

	public short getTrialDuration() {
		return this.trialDuration;
	}

	public void setTrialDuration(short trialDuration) {
		this.trialDuration = trialDuration;
	}

	public String getTrialFrequency() {
		return this.trialFrequency;
	}

	public void setTrialFrequency(String trialFrequency) {
		this.trialFrequency = trialFrequency;
	}

	public BigDecimal getTrialPrice() {
		return this.trialPrice;
	}

	public void setTrialPrice(BigDecimal trialPrice) {
		this.trialPrice = trialPrice;
	}

}
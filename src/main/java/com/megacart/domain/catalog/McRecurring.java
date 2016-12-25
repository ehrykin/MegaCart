package com.megacart.domain.catalog;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the mc_recurring database table.
 * 
 */
@Entity
@Table(name="mc_recurring")
@NamedQuery(name="McRecurring.findAll", query="SELECT m FROM McRecurring m")
public class McRecurring implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="recurring_id")
	private Integer recurringId;

	private Integer cycle;

	private Integer duration;

	private String frequency;

	private BigDecimal price;

	@Column(name="sort_order")
	private Integer sortOrder;

	private byte status;

	@Column(name="trial_cycle")
	private Integer trialCycle;

	@Column(name="trial_duration")
	private Integer trialDuration;

	@Column(name="trial_frequency")
	private String trialFrequency;

	@Column(name="trial_price")
	private BigDecimal trialPrice;

	@Column(name="trial_status")
	private byte trialStatus;

	public McRecurring() {
	}

	public Integer getRecurringId() {
		return this.recurringId;
	}

	public void setRecurringId(Integer recurringId) {
		this.recurringId = recurringId;
	}

	public Integer getCycle() {
		return this.cycle;
	}

	public void setCycle(Integer cycle) {
		this.cycle = cycle;
	}

	public Integer getDuration() {
		return this.duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public String getFrequency() {
		return this.frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Integer getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(Integer sortOrder) {
		this.sortOrder = sortOrder;
	}

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

	public Integer getTrialCycle() {
		return this.trialCycle;
	}

	public void setTrialCycle(Integer trialCycle) {
		this.trialCycle = trialCycle;
	}

	public Integer getTrialDuration() {
		return this.trialDuration;
	}

	public void setTrialDuration(Integer trialDuration) {
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

	public byte getTrialStatus() {
		return this.trialStatus;
	}

	public void setTrialStatus(byte trialStatus) {
		this.trialStatus = trialStatus;
	}

}
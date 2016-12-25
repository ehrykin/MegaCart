package com.megacart.domain.sale;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the mc_voucher_history database table.
 * 
 */
@Entity
@Table(name="mc_voucher_history")
@NamedQuery(name="McVoucherHistory.findAll", query="SELECT m FROM McVoucherHistory m")
public class McVoucherHistory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="voucher_history_id")
	private Integer voucherHistoryId;

	private BigDecimal amount;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_added")
	private Date dateAdded;

	@Column(name="order_id")
	private Integer orderId;

	@Column(name="voucher_id")
	private Integer voucherId;

	public McVoucherHistory() {
	}

	public Integer getVoucherHistoryId() {
		return this.voucherHistoryId;
	}

	public void setVoucherHistoryId(Integer voucherHistoryId) {
		this.voucherHistoryId = voucherHistoryId;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
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

	public Integer getVoucherId() {
		return this.voucherId;
	}

	public void setVoucherId(Integer voucherId) {
		this.voucherId = voucherId;
	}

}
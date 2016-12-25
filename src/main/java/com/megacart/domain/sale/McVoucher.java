package com.megacart.domain.sale;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the mc_voucher database table.
 * 
 */
@Entity
@Table(name="mc_voucher")
@NamedQuery(name="McVoucher.findAll", query="SELECT m FROM McVoucher m")
public class McVoucher implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="voucher_id")
	private Integer voucherId;

	private BigDecimal amount;

	private String code;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_added")
	private Date dateAdded;

	@Column(name="from_email")
	private String fromEmail;

	@Column(name="from_name")
	private String fromName;

	@Lob
	private String message;

	@Column(name="order_id")
	private Integer orderId;

	private byte status;

	@Column(name="to_email")
	private String toEmail;

	@Column(name="to_name")
	private String toName;

	@Column(name="voucher_theme_id")
	private Integer voucherThemeId;

	public McVoucher() {
	}

	public Integer getVoucherId() {
		return this.voucherId;
	}

	public void setVoucherId(Integer voucherId) {
		this.voucherId = voucherId;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Date getDateAdded() {
		return this.dateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}

	public String getFromEmail() {
		return this.fromEmail;
	}

	public void setFromEmail(String fromEmail) {
		this.fromEmail = fromEmail;
	}

	public String getFromName() {
		return this.fromName;
	}

	public void setFromName(String fromName) {
		this.fromName = fromName;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

	public String getToEmail() {
		return this.toEmail;
	}

	public void setToEmail(String toEmail) {
		this.toEmail = toEmail;
	}

	public String getToName() {
		return this.toName;
	}

	public void setToName(String toName) {
		this.toName = toName;
	}

	public Integer getVoucherThemeId() {
		return this.voucherThemeId;
	}

	public void setVoucherThemeId(Integer voucherThemeId) {
		this.voucherThemeId = voucherThemeId;
	}

}
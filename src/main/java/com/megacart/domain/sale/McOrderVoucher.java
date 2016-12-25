package com.megacart.domain.sale;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the mc_order_voucher database table.
 * 
 */
@Entity
@Table(name="mc_order_voucher")
@NamedQuery(name="McOrderVoucher.findAll", query="SELECT m FROM McOrderVoucher m")
public class McOrderVoucher implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="order_voucher_id")
	private Integer orderVoucherId;

	private BigDecimal amount;

	private String code;

	private String description;

	@Column(name="from_email")
	private String fromEmail;

	@Column(name="from_name")
	private String fromName;

	@Lob
	private String message;

	@Column(name="order_id")
	private Integer orderId;

	@Column(name="to_email")
	private String toEmail;

	@Column(name="to_name")
	private String toName;

	@Column(name="voucher_id")
	private Integer voucherId;

	@Column(name="voucher_theme_id")
	private Integer voucherThemeId;

	public McOrderVoucher() {
	}

	public Integer getOrderVoucherId() {
		return this.orderVoucherId;
	}

	public void setOrderVoucherId(Integer orderVoucherId) {
		this.orderVoucherId = orderVoucherId;
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public Integer getVoucherId() {
		return this.voucherId;
	}

	public void setVoucherId(Integer voucherId) {
		this.voucherId = voucherId;
	}

	public Integer getVoucherThemeId() {
		return this.voucherThemeId;
	}

	public void setVoucherThemeId(Integer voucherThemeId) {
		this.voucherThemeId = voucherThemeId;
	}

}
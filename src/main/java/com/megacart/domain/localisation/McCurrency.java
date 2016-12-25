package com.megacart.domain.localisation;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the mc_currency database table.
 * 
 */
@Entity
@Table(name="mc_currency")
@NamedQuery(name="McCurrency.findAll", query="SELECT m FROM McCurrency m")
public class McCurrency implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="currency_id")
	private Integer currencyId;

	private String code;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_modified")
	private Date dateModified;

	@Column(name="decimal_place")
	private String decimalPlace;

	private byte status;

	@Column(name="symbol_left")
	private String symbolLeft;

	@Column(name="symbol_right")
	private String symbolRight;

	private String title;

	private float value;

	public McCurrency() {
	}

	public Integer getCurrencyId() {
		return this.currencyId;
	}

	public void setCurrencyId(Integer currencyId) {
		this.currencyId = currencyId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Date getDateModified() {
		return this.dateModified;
	}

	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;
	}

	public String getDecimalPlace() {
		return this.decimalPlace;
	}

	public void setDecimalPlace(String decimalPlace) {
		this.decimalPlace = decimalPlace;
	}

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

	public String getSymbolLeft() {
		return this.symbolLeft;
	}

	public void setSymbolLeft(String symbolLeft) {
		this.symbolLeft = symbolLeft;
	}

	public String getSymbolRight() {
		return this.symbolRight;
	}

	public void setSymbolRight(String symbolRight) {
		this.symbolRight = symbolRight;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public float getValue() {
		return this.value;
	}

	public void setValue(float value) {
		this.value = value;
	}

}
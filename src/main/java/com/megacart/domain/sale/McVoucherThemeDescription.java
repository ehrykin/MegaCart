package com.megacart.domain.sale;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_voucher_theme_description database table.
 * 
 */
@Entity
@Table(name="mc_voucher_theme_description")
@NamedQuery(name="McVoucherThemeDescription.findAll", query="SELECT m FROM McVoucherThemeDescription m")
public class McVoucherThemeDescription implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private McVoucherThemeDescriptionPK id;

	private String name;

	public McVoucherThemeDescription() {
	}

	public McVoucherThemeDescriptionPK getId() {
		return this.id;
	}

	public void setId(McVoucherThemeDescriptionPK id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
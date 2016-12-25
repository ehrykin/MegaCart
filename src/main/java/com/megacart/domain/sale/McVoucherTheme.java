package com.megacart.domain.sale;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_voucher_theme database table.
 * 
 */
@Entity
@Table(name="mc_voucher_theme")
@NamedQuery(name="McVoucherTheme.findAll", query="SELECT m FROM McVoucherTheme m")
public class McVoucherTheme implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="voucher_theme_id")
	private Integer voucherThemeId;

	private String image;

	public McVoucherTheme() {
	}

	public Integer getVoucherThemeId() {
		return this.voucherThemeId;
	}

	public void setVoucherThemeId(Integer voucherThemeId) {
		this.voucherThemeId = voucherThemeId;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

}
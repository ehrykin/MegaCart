package com.megacart.domain.sale;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the mc_voucher_theme_description database table.
 * 
 */
@Embeddable
public class McVoucherThemeDescriptionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="voucher_theme_id")
	private Integer voucherThemeId;

	@Column(name="language_id")
	private Integer languageId;

	public McVoucherThemeDescriptionPK() {
	}
	public Integer getVoucherThemeId() {
		return this.voucherThemeId;
	}
	public void setVoucherThemeId(Integer voucherThemeId) {
		this.voucherThemeId = voucherThemeId;
	}
	public Integer getLanguageId() {
		return this.languageId;
	}
	public void setLanguageId(Integer languageId) {
		this.languageId = languageId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof McVoucherThemeDescriptionPK)) {
			return false;
		}
		McVoucherThemeDescriptionPK castOther = (McVoucherThemeDescriptionPK)other;
		return 
			(this.voucherThemeId == castOther.voucherThemeId)
			&& (this.languageId == castOther.languageId);
	}

	public int hashCode() {
		final Integer prime = 31;
		Integer hash = 17;
		hash = hash * prime + this.voucherThemeId;
		hash = hash * prime + this.languageId;
		
		return hash;
	}
}
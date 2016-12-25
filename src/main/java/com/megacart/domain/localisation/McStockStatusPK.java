package com.megacart.domain.localisation;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the mc_stock_status database table.
 * 
 */
@Embeddable
public class McStockStatusPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="stock_status_id")
	private Integer stockStatusId;

	@Column(name="language_id")
	private Integer languageId;

	public McStockStatusPK() {
	}
	public Integer getStockStatusId() {
		return this.stockStatusId;
	}
	public void setStockStatusId(Integer stockStatusId) {
		this.stockStatusId = stockStatusId;
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
		if (!(other instanceof McStockStatusPK)) {
			return false;
		}
		McStockStatusPK castOther = (McStockStatusPK)other;
		return 
			(this.stockStatusId == castOther.stockStatusId)
			&& (this.languageId == castOther.languageId);
	}

	public int hashCode() {
		final Integer prime = 31;
		Integer hash = 17;
		hash = hash * prime + this.stockStatusId;
		hash = hash * prime + this.languageId;
		
		return hash;
	}
}
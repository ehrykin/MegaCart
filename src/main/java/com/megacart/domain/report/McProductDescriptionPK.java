package com.megacart.domain.report;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the mc_product_description database table.
 * 
 */
@Embeddable
public class McProductDescriptionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="product_id")
	private Integer productId;

	@Column(name="language_id")
	private Integer languageId;

	public McProductDescriptionPK() {
	}
	public Integer getProductId() {
		return this.productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
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
		if (!(other instanceof McProductDescriptionPK)) {
			return false;
		}
		McProductDescriptionPK castOther = (McProductDescriptionPK)other;
		return 
			(this.productId == castOther.productId)
			&& (this.languageId == castOther.languageId);
	}

	public int hashCode() {
		final Integer prime = 31;
		Integer hash = 17;
		hash = hash * prime + this.productId;
		hash = hash * prime + this.languageId;
		
		return hash;
	}
}
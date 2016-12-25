package com.megacart.domain.report;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the mc_product_attribute database table.
 * 
 */
@Embeddable
public class McProductAttributePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="product_id")
	private Integer productId;

	@Column(name="attribute_id")
	private Integer attributeId;

	@Column(name="language_id")
	private Integer languageId;

	public McProductAttributePK() {
	}
	public Integer getProductId() {
		return this.productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public Integer getAttributeId() {
		return this.attributeId;
	}
	public void setAttributeId(Integer attributeId) {
		this.attributeId = attributeId;
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
		if (!(other instanceof McProductAttributePK)) {
			return false;
		}
		McProductAttributePK castOther = (McProductAttributePK)other;
		return 
			(this.productId == castOther.productId)
			&& (this.attributeId == castOther.attributeId)
			&& (this.languageId == castOther.languageId);
	}

	public int hashCode() {
		final Integer prime = 31;
		Integer hash = 17;
		hash = hash * prime + this.productId;
		hash = hash * prime + this.attributeId;
		hash = hash * prime + this.languageId;
		
		return hash;
	}
}
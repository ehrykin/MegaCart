package com.megacart.domain.report;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the mc_product_related database table.
 * 
 */
@Embeddable
public class McProductRelatedPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="product_id")
	private Integer productId;

	@Column(name="related_id")
	private Integer relatedId;

	public McProductRelatedPK() {
	}
	public Integer getProductId() {
		return this.productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public Integer getRelatedId() {
		return this.relatedId;
	}
	public void setRelatedId(Integer relatedId) {
		this.relatedId = relatedId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof McProductRelatedPK)) {
			return false;
		}
		McProductRelatedPK castOther = (McProductRelatedPK)other;
		return 
			(this.productId == castOther.productId)
			&& (this.relatedId == castOther.relatedId);
	}

	public int hashCode() {
		final Integer prime = 31;
		Integer hash = 17;
		hash = hash * prime + this.productId;
		hash = hash * prime + this.relatedId;
		
		return hash;
	}
}
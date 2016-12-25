package com.megacart.domain.report;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the mc_product_filter database table.
 * 
 */
@Embeddable
public class McProductFilterPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="product_id")
	private Integer productId;

	@Column(name="filter_id")
	private Integer filterId;

	public McProductFilterPK() {
	}
	public Integer getProductId() {
		return this.productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public Integer getFilterId() {
		return this.filterId;
	}
	public void setFilterId(Integer filterId) {
		this.filterId = filterId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof McProductFilterPK)) {
			return false;
		}
		McProductFilterPK castOther = (McProductFilterPK)other;
		return 
			(this.productId == castOther.productId)
			&& (this.filterId == castOther.filterId);
	}

	public int hashCode() {
		final Integer prime = 31;
		Integer hash = 17;
		hash = hash * prime + this.productId;
		hash = hash * prime + this.filterId;
		
		return hash;
	}
}
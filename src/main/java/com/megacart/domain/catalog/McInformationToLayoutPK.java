package com.megacart.domain.catalog;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the mc_information_to_layout database table.
 * 
 */
@Embeddable
public class McInformationToLayoutPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="information_id")
	private Integer informationId;

	@Column(name="store_id")
	private Integer storeId;

	public McInformationToLayoutPK() {
	}
	public Integer getInformationId() {
		return this.informationId;
	}
	public void setInformationId(Integer informationId) {
		this.informationId = informationId;
	}
	public Integer getStoreId() {
		return this.storeId;
	}
	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof McInformationToLayoutPK)) {
			return false;
		}
		McInformationToLayoutPK castOther = (McInformationToLayoutPK)other;
		return 
			(this.informationId == castOther.informationId)
			&& (this.storeId == castOther.storeId);
	}

	public int hashCode() {
		final Integer prime = 31;
		Integer hash = 17;
		hash = hash * prime + this.informationId;
		hash = hash * prime + this.storeId;
		
		return hash;
	}
}
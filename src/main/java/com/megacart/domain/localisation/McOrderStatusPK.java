package com.megacart.domain.localisation;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the mc_order_status database table.
 * 
 */
@Embeddable
public class McOrderStatusPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="order_status_id")
	private Integer orderStatusId;

	@Column(name="language_id")
	private Integer languageId;

	public McOrderStatusPK() {
	}
	public Integer getOrderStatusId() {
		return this.orderStatusId;
	}
	public void setOrderStatusId(Integer orderStatusId) {
		this.orderStatusId = orderStatusId;
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
		if (!(other instanceof McOrderStatusPK)) {
			return false;
		}
		McOrderStatusPK castOther = (McOrderStatusPK)other;
		return 
			(this.orderStatusId == castOther.orderStatusId)
			&& (this.languageId == castOther.languageId);
	}

	public int hashCode() {
		final Integer prime = 31;
		Integer hash = 17;
		hash = hash * prime + this.orderStatusId;
		hash = hash * prime + this.languageId;
		
		return hash;
	}
}
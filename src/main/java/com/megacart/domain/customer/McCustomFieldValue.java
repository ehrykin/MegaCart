package com.megacart.domain.customer;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_custom_field_value database table.
 * 
 */
@Entity
@Table(name="mc_custom_field_value")
@NamedQuery(name="McCustomFieldValue.findAll", query="SELECT m FROM McCustomFieldValue m")
public class McCustomFieldValue implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="custom_field_value_id")
	private Integer customFieldValueId;

	@Column(name="custom_field_id")
	private Integer customFieldId;

	@Column(name="sort_order")
	private Integer sortOrder;

	public McCustomFieldValue() {
	}

	public Integer getCustomFieldValueId() {
		return this.customFieldValueId;
	}

	public void setCustomFieldValueId(Integer customFieldValueId) {
		this.customFieldValueId = customFieldValueId;
	}

	public Integer getCustomFieldId() {
		return this.customFieldId;
	}

	public void setCustomFieldId(Integer customFieldId) {
		this.customFieldId = customFieldId;
	}

	public Integer getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(Integer sortOrder) {
		this.sortOrder = sortOrder;
	}

}
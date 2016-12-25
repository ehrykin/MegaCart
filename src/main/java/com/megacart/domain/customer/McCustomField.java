package com.megacart.domain.customer;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_custom_field database table.
 * 
 */
@Entity
@Table(name="mc_custom_field")
@NamedQuery(name="McCustomField.findAll", query="SELECT m FROM McCustomField m")
public class McCustomField implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="custom_field_id")
	private Integer customFieldId;

	private String location;

	@Column(name="sort_order")
	private Integer sortOrder;

	private byte status;

	private String type;

	private String validation;

	@Lob
	private String value;

	public McCustomField() {
	}

	public Integer getCustomFieldId() {
		return this.customFieldId;
	}

	public void setCustomFieldId(Integer customFieldId) {
		this.customFieldId = customFieldId;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Integer getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(Integer sortOrder) {
		this.sortOrder = sortOrder;
	}

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getValidation() {
		return this.validation;
	}

	public void setValidation(String validation) {
		this.validation = validation;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
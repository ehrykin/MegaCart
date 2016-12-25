package com.megacart.domain.sale;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_order_custom_field database table.
 * 
 */
@Entity
@Table(name="mc_order_custom_field")
@NamedQuery(name="McOrderCustomField.findAll", query="SELECT m FROM McOrderCustomField m")
public class McOrderCustomField implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="order_custom_field_id")
	private Integer orderCustomFieldId;

	@Column(name="custom_field_id")
	private Integer customFieldId;

	@Column(name="custom_field_value_id")
	private Integer customFieldValueId;

	private String location;

	private String name;

	@Column(name="order_id")
	private Integer orderId;

	private String type;

	@Lob
	private String value;

	public McOrderCustomField() {
	}

	public Integer getOrderCustomFieldId() {
		return this.orderCustomFieldId;
	}

	public void setOrderCustomFieldId(Integer orderCustomFieldId) {
		this.orderCustomFieldId = orderCustomFieldId;
	}

	public Integer getCustomFieldId() {
		return this.customFieldId;
	}

	public void setCustomFieldId(Integer customFieldId) {
		this.customFieldId = customFieldId;
	}

	public Integer getCustomFieldValueId() {
		return this.customFieldValueId;
	}

	public void setCustomFieldValueId(Integer customFieldValueId) {
		this.customFieldValueId = customFieldValueId;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
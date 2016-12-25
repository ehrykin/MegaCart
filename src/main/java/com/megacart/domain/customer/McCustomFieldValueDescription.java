package com.megacart.domain.customer;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_custom_field_value_description database table.
 * 
 */
@Entity
@Table(name="mc_custom_field_value_description")
@NamedQuery(name="McCustomFieldValueDescription.findAll", query="SELECT m FROM McCustomFieldValueDescription m")
public class McCustomFieldValueDescription implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private McCustomFieldValueDescriptionPK id;

	@Column(name="custom_field_id")
	private Integer customFieldId;

	private String name;

	public McCustomFieldValueDescription() {
	}

	public McCustomFieldValueDescriptionPK getId() {
		return this.id;
	}

	public void setId(McCustomFieldValueDescriptionPK id) {
		this.id = id;
	}

	public Integer getCustomFieldId() {
		return this.customFieldId;
	}

	public void setCustomFieldId(Integer customFieldId) {
		this.customFieldId = customFieldId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
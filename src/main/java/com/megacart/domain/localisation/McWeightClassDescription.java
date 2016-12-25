package com.megacart.domain.localisation;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_weight_class_description database table.
 * 
 */
@Entity
@Table(name="mc_weight_class_description")
@NamedQuery(name="McWeightClassDescription.findAll", query="SELECT m FROM McWeightClassDescription m")
public class McWeightClassDescription implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private McWeightClassDescriptionPK id;

	private String title;

	private String unit;

	public McWeightClassDescription() {
	}

	public McWeightClassDescriptionPK getId() {
		return this.id;
	}

	public void setId(McWeightClassDescriptionPK id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

}
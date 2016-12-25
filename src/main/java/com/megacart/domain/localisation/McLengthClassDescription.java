package com.megacart.domain.localisation;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_length_class_description database table.
 * 
 */
@Entity
@Table(name="mc_length_class_description")
@NamedQuery(name="McLengthClassDescription.findAll", query="SELECT m FROM McLengthClassDescription m")
public class McLengthClassDescription implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private McLengthClassDescriptionPK id;

	private String title;

	private String unit;

	public McLengthClassDescription() {
	}

	public McLengthClassDescriptionPK getId() {
		return this.id;
	}

	public void setId(McLengthClassDescriptionPK id) {
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
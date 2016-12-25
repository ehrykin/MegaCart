package com.megacart.domain.report;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_product_attribute database table.
 * 
 */
@Entity
@Table(name="mc_product_attribute")
@NamedQuery(name="McProductAttribute.findAll", query="SELECT m FROM McProductAttribute m")
public class McProductAttribute implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private McProductAttributePK id;

	@Lob
	private String text;

	public McProductAttribute() {
	}

	public McProductAttributePK getId() {
		return this.id;
	}

	public void setId(McProductAttributePK id) {
		this.id = id;
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
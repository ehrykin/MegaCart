package com.megacart.domain.catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_option_value_description database table.
 * 
 */
@Entity
@Table(name="mc_option_value_description")
@NamedQuery(name="McOptionValueDescription.findAll", query="SELECT m FROM McOptionValueDescription m")
public class McOptionValueDescription implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private McOptionValueDescriptionPK id;

	private String name;

	@Column(name="option_id")
	private Integer optionId;

	public McOptionValueDescription() {
	}

	public McOptionValueDescriptionPK getId() {
		return this.id;
	}

	public void setId(McOptionValueDescriptionPK id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getOptionId() {
		return this.optionId;
	}

	public void setOptionId(Integer optionId) {
		this.optionId = optionId;
	}

}
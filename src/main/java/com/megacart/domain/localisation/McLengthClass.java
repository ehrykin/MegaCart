package com.megacart.domain.localisation;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the mc_length_class database table.
 * 
 */
@Entity
@Table(name="mc_length_class")
@NamedQuery(name="McLengthClass.findAll", query="SELECT m FROM McLengthClass m")
public class McLengthClass implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="length_class_id")
	private Integer lengthClassId;

	private BigDecimal value;

	public McLengthClass() {
	}

	public Integer getLengthClassId() {
		return this.lengthClassId;
	}

	public void setLengthClassId(Integer lengthClassId) {
		this.lengthClassId = lengthClassId;
	}

	public BigDecimal getValue() {
		return this.value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

}
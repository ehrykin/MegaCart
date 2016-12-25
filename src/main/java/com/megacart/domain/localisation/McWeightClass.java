package com.megacart.domain.localisation;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the mc_weight_class database table.
 * 
 */
@Entity
@Table(name="mc_weight_class")
@NamedQuery(name="McWeightClass.findAll", query="SELECT m FROM McWeightClass m")
public class McWeightClass implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="weight_class_id")
	private Integer weightClassId;

	private BigDecimal value;

	public McWeightClass() {
	}

	public Integer getWeightClassId() {
		return this.weightClassId;
	}

	public void setWeightClassId(Integer weightClassId) {
		this.weightClassId = weightClassId;
	}

	public BigDecimal getValue() {
		return this.value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

}
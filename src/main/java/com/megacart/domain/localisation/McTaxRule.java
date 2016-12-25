package com.megacart.domain.localisation;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_tax_rule database table.
 * 
 */
@Entity
@Table(name="mc_tax_rule")
@NamedQuery(name="McTaxRule.findAll", query="SELECT m FROM McTaxRule m")
public class McTaxRule implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="tax_rule_id")
	private Integer taxRuleId;

	private String based;

	private Integer priority;

	@Column(name="tax_class_id")
	private Integer taxClassId;

	@Column(name="tax_rate_id")
	private Integer taxRateId;

	public McTaxRule() {
	}

	public Integer getTaxRuleId() {
		return this.taxRuleId;
	}

	public void setTaxRuleId(Integer taxRuleId) {
		this.taxRuleId = taxRuleId;
	}

	public String getBased() {
		return this.based;
	}

	public void setBased(String based) {
		this.based = based;
	}

	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public Integer getTaxClassId() {
		return this.taxClassId;
	}

	public void setTaxClassId(Integer taxClassId) {
		this.taxClassId = taxClassId;
	}

	public Integer getTaxRateId() {
		return this.taxRateId;
	}

	public void setTaxRateId(Integer taxRateId) {
		this.taxRateId = taxRateId;
	}

}
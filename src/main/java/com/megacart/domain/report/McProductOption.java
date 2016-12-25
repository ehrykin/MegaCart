package com.megacart.domain.report;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_product_option database table.
 * 
 */
@Entity
@Table(name="mc_product_option")
@NamedQuery(name="McProductOption.findAll", query="SELECT m FROM McProductOption m")
public class McProductOption implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="product_option_id")
	private Integer productOptionId;

	@Column(name="option_id")
	private Integer optionId;

	@Column(name="product_id")
	private Integer productId;

	private byte required;

	@Lob
	private String value;

	public McProductOption() {
	}

	public Integer getProductOptionId() {
		return this.productOptionId;
	}

	public void setProductOptionId(Integer productOptionId) {
		this.productOptionId = productOptionId;
	}

	public Integer getOptionId() {
		return this.optionId;
	}

	public void setOptionId(Integer optionId) {
		this.optionId = optionId;
	}

	public Integer getProductId() {
		return this.productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public byte getRequired() {
		return this.required;
	}

	public void setRequired(byte required) {
		this.required = required;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
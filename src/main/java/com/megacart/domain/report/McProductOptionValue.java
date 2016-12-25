package com.megacart.domain.report;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the mc_product_option_value database table.
 * 
 */
@Entity
@Table(name="mc_product_option_value")
@NamedQuery(name="McProductOptionValue.findAll", query="SELECT m FROM McProductOptionValue m")
public class McProductOptionValue implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="product_option_value_id")
	private Integer productOptionValueId;

	@Column(name="option_id")
	private Integer optionId;

	@Column(name="option_value_id")
	private Integer optionValueId;

	private Integer points;

	@Column(name="points_prefix")
	private String pointsPrefix;

	private BigDecimal price;

	@Column(name="price_prefix")
	private String pricePrefix;

	@Column(name="product_id")
	private Integer productId;

	@Column(name="product_option_id")
	private Integer productOptionId;

	private Integer quantity;

	private byte subtract;

	private BigDecimal weight;

	@Column(name="weight_prefix")
	private String weightPrefix;

	public McProductOptionValue() {
	}

	public Integer getProductOptionValueId() {
		return this.productOptionValueId;
	}

	public void setProductOptionValueId(Integer productOptionValueId) {
		this.productOptionValueId = productOptionValueId;
	}

	public Integer getOptionId() {
		return this.optionId;
	}

	public void setOptionId(Integer optionId) {
		this.optionId = optionId;
	}

	public Integer getOptionValueId() {
		return this.optionValueId;
	}

	public void setOptionValueId(Integer optionValueId) {
		this.optionValueId = optionValueId;
	}

	public Integer getPoints() {
		return this.points;
	}

	public void setPoints(Integer points) {
		this.points = points;
	}

	public String getPointsPrefix() {
		return this.pointsPrefix;
	}

	public void setPointsPrefix(String pointsPrefix) {
		this.pointsPrefix = pointsPrefix;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getPricePrefix() {
		return this.pricePrefix;
	}

	public void setPricePrefix(String pricePrefix) {
		this.pricePrefix = pricePrefix;
	}

	public Integer getProductId() {
		return this.productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getProductOptionId() {
		return this.productOptionId;
	}

	public void setProductOptionId(Integer productOptionId) {
		this.productOptionId = productOptionId;
	}

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public byte getSubtract() {
		return this.subtract;
	}

	public void setSubtract(byte subtract) {
		this.subtract = subtract;
	}

	public BigDecimal getWeight() {
		return this.weight;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

	public String getWeightPrefix() {
		return this.weightPrefix;
	}

	public void setWeightPrefix(String weightPrefix) {
		this.weightPrefix = weightPrefix;
	}

}
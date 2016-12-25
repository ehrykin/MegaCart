package com.megacart.domain.catalog;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the mc_product database table.
 * 
 */
@Entity
@Table(name="mc_product")
@NamedQuery(name="McProduct.findAll", query="SELECT m FROM McProduct m")
public class McProduct implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="product_id")
	private Integer productId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_added")
	private Date dateAdded;

	@Temporal(TemporalType.DATE)
	@Column(name="date_available")
	private Date dateAvailable;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_modified")
	private Date dateModified;

	private String ean;

	private BigDecimal height;

	private String image;

	private String isbn;

	private String jan;

	private BigDecimal length;

	@Column(name="length_class_id")
	private Integer lengthClassId;

	private String location;

	@Column(name="manufacturer_id")
	private Integer manufacturerId;

	private Integer minimum;

	private String model;

	private String mpn;

	private Integer points;

	private BigDecimal price;

	private Integer quantity;

	private byte shipping;

	private String sku;

	@Column(name="sort_order")
	private Integer sortOrder;

	private byte status;

	@Column(name="stock_status_id")
	private Integer stockStatusId;

	private byte subtract;

	@Column(name="tax_class_id")
	private Integer taxClassId;

	private String upc;

	private Integer viewed;

	private BigDecimal weight;

	@Column(name="weight_class_id")
	private Integer weightClassId;

	private BigDecimal width;

	public McProduct() {
	}

	public Integer getProductId() {
		return this.productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Date getDateAdded() {
		return this.dateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}

	public Date getDateAvailable() {
		return this.dateAvailable;
	}

	public void setDateAvailable(Date dateAvailable) {
		this.dateAvailable = dateAvailable;
	}

	public Date getDateModified() {
		return this.dateModified;
	}

	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;
	}

	public String getEan() {
		return this.ean;
	}

	public void setEan(String ean) {
		this.ean = ean;
	}

	public BigDecimal getHeight() {
		return this.height;
	}

	public void setHeight(BigDecimal height) {
		this.height = height;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getIsbn() {
		return this.isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getJan() {
		return this.jan;
	}

	public void setJan(String jan) {
		this.jan = jan;
	}

	public BigDecimal getLength() {
		return this.length;
	}

	public void setLength(BigDecimal length) {
		this.length = length;
	}

	public Integer getLengthClassId() {
		return this.lengthClassId;
	}

	public void setLengthClassId(Integer lengthClassId) {
		this.lengthClassId = lengthClassId;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Integer getManufacturerId() {
		return this.manufacturerId;
	}

	public void setManufacturerId(Integer manufacturerId) {
		this.manufacturerId = manufacturerId;
	}

	public Integer getMinimum() {
		return this.minimum;
	}

	public void setMinimum(Integer minimum) {
		this.minimum = minimum;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMpn() {
		return this.mpn;
	}

	public void setMpn(String mpn) {
		this.mpn = mpn;
	}

	public Integer getPoints() {
		return this.points;
	}

	public void setPoints(Integer points) {
		this.points = points;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public byte getShipping() {
		return this.shipping;
	}

	public void setShipping(byte shipping) {
		this.shipping = shipping;
	}

	public String getSku() {
		return this.sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public Integer getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(Integer sortOrder) {
		this.sortOrder = sortOrder;
	}

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

	public Integer getStockStatusId() {
		return this.stockStatusId;
	}

	public void setStockStatusId(Integer stockStatusId) {
		this.stockStatusId = stockStatusId;
	}

	public byte getSubtract() {
		return this.subtract;
	}

	public void setSubtract(byte subtract) {
		this.subtract = subtract;
	}

	public Integer getTaxClassId() {
		return this.taxClassId;
	}

	public void setTaxClassId(Integer taxClassId) {
		this.taxClassId = taxClassId;
	}

	public String getUpc() {
		return this.upc;
	}

	public void setUpc(String upc) {
		this.upc = upc;
	}

	public Integer getViewed() {
		return this.viewed;
	}

	public void setViewed(Integer viewed) {
		this.viewed = viewed;
	}

	public BigDecimal getWeight() {
		return this.weight;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

	public Integer getWeightClassId() {
		return this.weightClassId;
	}

	public void setWeightClassId(Integer weightClassId) {
		this.weightClassId = weightClassId;
	}

	public BigDecimal getWidth() {
		return this.width;
	}

	public void setWidth(BigDecimal width) {
		this.width = width;
	}

}
package com.megacart.domain.report;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the mc_return database table.
 * 
 */
@Entity
@Table(name="mc_return")
@NamedQuery(name="McReturn.findAll", query="SELECT m FROM McReturn m")
public class McReturn implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="return_id")
	private Integer returnId;

	@Lob
	private String comment;

	@Column(name="customer_id")
	private Integer customerId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_added")
	private Date dateAdded;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_modified")
	private Date dateModified;

	@Temporal(TemporalType.DATE)
	@Column(name="date_ordered")
	private Date dateOrdered;

	private String email;

	private String firstname;

	private String lastname;

	private String model;

	private byte opened;

	@Column(name="order_id")
	private Integer orderId;

	private String product;

	@Column(name="product_id")
	private Integer productId;

	private Integer quantity;

	@Column(name="return_action_id")
	private Integer returnActionId;

	@Column(name="return_reason_id")
	private Integer returnReasonId;

	@Column(name="return_status_id")
	private Integer returnStatusId;

	private String telephone;

	public McReturn() {
	}

	public Integer getReturnId() {
		return this.returnId;
	}

	public void setReturnId(Integer returnId) {
		this.returnId = returnId;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Integer getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Date getDateAdded() {
		return this.dateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}

	public Date getDateModified() {
		return this.dateModified;
	}

	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;
	}

	public Date getDateOrdered() {
		return this.dateOrdered;
	}

	public void setDateOrdered(Date dateOrdered) {
		this.dateOrdered = dateOrdered;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public byte getOpened() {
		return this.opened;
	}

	public void setOpened(byte opened) {
		this.opened = opened;
	}

	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getProduct() {
		return this.product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public Integer getProductId() {
		return this.productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getReturnActionId() {
		return this.returnActionId;
	}

	public void setReturnActionId(Integer returnActionId) {
		this.returnActionId = returnActionId;
	}

	public Integer getReturnReasonId() {
		return this.returnReasonId;
	}

	public void setReturnReasonId(Integer returnReasonId) {
		this.returnReasonId = returnReasonId;
	}

	public Integer getReturnStatusId() {
		return this.returnStatusId;
	}

	public void setReturnStatusId(Integer returnStatusId) {
		this.returnStatusId = returnStatusId;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

}
package com.megacart.domain.localisation;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the mc_tax_class database table.
 * 
 */
@Entity
@Table(name="mc_tax_class")
@NamedQuery(name="McTaxClass.findAll", query="SELECT m FROM McTaxClass m")
public class McTaxClass implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="tax_class_id")
	private Integer taxClassId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_added")
	private Date dateAdded;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_modified")
	private Date dateModified;

	private String description;

	private String title;

	public McTaxClass() {
	}

	public Integer getTaxClassId() {
		return this.taxClassId;
	}

	public void setTaxClassId(Integer taxClassId) {
		this.taxClassId = taxClassId;
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
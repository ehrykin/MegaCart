package com.megacart.domain.catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_category_description database table.
 * 
 */
@Entity
@Table(name="mc_category_description")
@NamedQuery(name="McCategoryDescription.findAll", query="SELECT m FROM McCategoryDescription m")
public class McCategoryDescription implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private McCategoryDescriptionPK id;

	@Lob
	private String description;

	@Column(name="meta_description")
	private String metaDescription;

	@Column(name="meta_keyword")
	private String metaKeyword;

	@Column(name="meta_title")
	private String metaTitle;

	private String name;

	public McCategoryDescription() {
	}

	public McCategoryDescriptionPK getId() {
		return this.id;
	}

	public void setId(McCategoryDescriptionPK id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getMetaDescription() {
		return this.metaDescription;
	}

	public void setMetaDescription(String metaDescription) {
		this.metaDescription = metaDescription;
	}

	public String getMetaKeyword() {
		return this.metaKeyword;
	}

	public void setMetaKeyword(String metaKeyword) {
		this.metaKeyword = metaKeyword;
	}

	public String getMetaTitle() {
		return this.metaTitle;
	}

	public void setMetaTitle(String metaTitle) {
		this.metaTitle = metaTitle;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
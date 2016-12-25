package com.megacart.domain.catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_information_description database table.
 * 
 */
@Entity
@Table(name="mc_information_description")
@NamedQuery(name="McInformationDescription.findAll", query="SELECT m FROM McInformationDescription m")
public class McInformationDescription implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private McInformationDescriptionPK id;

	@Lob
	private String description;

	@Column(name="meta_description")
	private String metaDescription;

	@Column(name="meta_keyword")
	private String metaKeyword;

	@Column(name="meta_title")
	private String metaTitle;

	private String title;

	public McInformationDescription() {
	}

	public McInformationDescriptionPK getId() {
		return this.id;
	}

	public void setId(McInformationDescriptionPK id) {
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

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
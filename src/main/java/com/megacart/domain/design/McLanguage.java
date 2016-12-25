package com.megacart.domain.design;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_language database table.
 * 
 */
@Entity
@Table(name="mc_language")
@NamedQuery(name="McLanguage.findAll", query="SELECT m FROM McLanguage m")
public class McLanguage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="language_id")
	private Integer languageId;

	private String code;

	private String directory;

	private String image;

	private String locale;

	private String name;

	@Column(name="sort_order")
	private Integer sortOrder;

	private byte status;

	public McLanguage() {
	}

	public Integer getLanguageId() {
		return this.languageId;
	}

	public void setLanguageId(Integer languageId) {
		this.languageId = languageId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDirectory() {
		return this.directory;
	}

	public void setDirectory(String directory) {
		this.directory = directory;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getLocale() {
		return this.locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
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

}
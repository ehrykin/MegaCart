package com.megacart.domain.localisation;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_translation database table.
 * 
 */
@Entity
@Table(name="mc_translation")
@NamedQuery(name="McTranslation.findAll", query="SELECT m FROM McTranslation m")
public class McTranslation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="translation_id")
	private Integer translationId;

	private String key;

	@Column(name="language_id")
	private Integer languageId;

	private String route;

	@Column(name="store_id")
	private Integer storeId;

	@Lob
	private String value;

	public McTranslation() {
	}

	public Integer getTranslationId() {
		return this.translationId;
	}

	public void setTranslationId(Integer translationId) {
		this.translationId = translationId;
	}

	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Integer getLanguageId() {
		return this.languageId;
	}

	public void setLanguageId(Integer languageId) {
		this.languageId = languageId;
	}

	public String getRoute() {
		return this.route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	public Integer getStoreId() {
		return this.storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
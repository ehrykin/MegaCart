package com.megacart.domain.setting;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_store database table.
 * 
 */
@Entity
@Table(name="mc_store")
@NamedQuery(name="McStore.findAll", query="SELECT m FROM McStore m")
public class McStore implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="store_id")
	private Integer storeId;

	private String name;

	private String ssl;

	private String url;

	public McStore() {
	}

	public Integer getStoreId() {
		return this.storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSsl() {
		return this.ssl;
	}

	public void setSsl(String ssl) {
		this.ssl = ssl;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
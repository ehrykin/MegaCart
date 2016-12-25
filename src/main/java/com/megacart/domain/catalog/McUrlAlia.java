package com.megacart.domain.catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_url_alias database table.
 * 
 */
@Entity
@Table(name="mc_url_alias")
@NamedQuery(name="McUrlAlia.findAll", query="SELECT m FROM McUrlAlia m")
public class McUrlAlia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="url_alias_id")
	private Integer urlAliasId;

	private String keyword;

	private String query;

	public McUrlAlia() {
	}

	public Integer getUrlAliasId() {
		return this.urlAliasId;
	}

	public void setUrlAliasId(Integer urlAliasId) {
		this.urlAliasId = urlAliasId;
	}

	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getQuery() {
		return this.query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

}
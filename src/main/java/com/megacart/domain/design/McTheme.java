package com.megacart.domain.design;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_theme database table.
 * 
 */
@Entity
@Table(name="mc_theme")
@NamedQuery(name="McTheme.findAll", query="SELECT m FROM McTheme m")
public class McTheme implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="theme_id")
	private Integer themeId;

	@Lob
	private String code;

	private String route;

	@Column(name="store_id")
	private Integer storeId;

	private String theme;

	public McTheme() {
	}

	public Integer getThemeId() {
		return this.themeId;
	}

	public void setThemeId(Integer themeId) {
		this.themeId = themeId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
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

	public String getTheme() {
		return this.theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

}
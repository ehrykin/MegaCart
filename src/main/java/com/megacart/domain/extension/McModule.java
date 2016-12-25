package com.megacart.domain.extension;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_module database table.
 * 
 */
@Entity
@Table(name="mc_module")
@NamedQuery(name="McModule.findAll", query="SELECT m FROM McModule m")
public class McModule implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="module_id")
	private Integer moduleId;

	private String code;

	private String name;

	@Lob
	private String setting;

	public McModule() {
	}

	public Integer getModuleId() {
		return this.moduleId;
	}

	public void setModuleId(Integer moduleId) {
		this.moduleId = moduleId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSetting() {
		return this.setting;
	}

	public void setSetting(String setting) {
		this.setting = setting;
	}

}
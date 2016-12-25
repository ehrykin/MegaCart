package com.megacart.domain.setting;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_setting database table.
 * 
 */
@Entity
@Table(name="mc_setting")
@NamedQuery(name="McSetting.findAll", query="SELECT m FROM McSetting m")
public class McSetting implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="setting_id")
	private Integer settingId;

	private String code;

	private String key;

	private byte serialized;

	@Column(name="store_id")
	private Integer storeId;

	@Lob
	private String value;

	public McSetting() {
	}

	public Integer getSettingId() {
		return this.settingId;
	}

	public void setSettingId(Integer settingId) {
		this.settingId = settingId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public byte getSerialized() {
		return this.serialized;
	}

	public void setSerialized(byte serialized) {
		this.serialized = serialized;
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
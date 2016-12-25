package com.megacart.domain.extension;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_extension database table.
 * 
 */
@Entity
@Table(name="mc_extension")
@NamedQuery(name="McExtension.findAll", query="SELECT m FROM McExtension m")
public class McExtension implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="extension_id")
	private Integer extensionId;

	private String code;

	private String type;

	public McExtension() {
	}

	public Integer getExtensionId() {
		return this.extensionId;
	}

	public void setExtensionId(Integer extensionId) {
		this.extensionId = extensionId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
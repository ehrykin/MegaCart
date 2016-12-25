package com.megacart.domain.catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_download_description database table.
 * 
 */
@Entity
@Table(name="mc_download_description")
@NamedQuery(name="McDownloadDescription.findAll", query="SELECT m FROM McDownloadDescription m")
public class McDownloadDescription implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private McDownloadDescriptionPK id;

	private String name;

	public McDownloadDescription() {
	}

	public McDownloadDescriptionPK getId() {
		return this.id;
	}

	public void setId(McDownloadDescriptionPK id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
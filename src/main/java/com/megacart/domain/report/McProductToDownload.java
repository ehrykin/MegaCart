package com.megacart.domain.report;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_product_to_download database table.
 * 
 */
@Entity
@Table(name="mc_product_to_download")
@NamedQuery(name="McProductToDownload.findAll", query="SELECT m FROM McProductToDownload m")
public class McProductToDownload implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private McProductToDownloadPK id;

	public McProductToDownload() {
	}

	public McProductToDownloadPK getId() {
		return this.id;
	}

	public void setId(McProductToDownloadPK id) {
		this.id = id;
	}

}
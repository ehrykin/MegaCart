package com.megacart.domain.report;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the mc_product_to_download database table.
 * 
 */
@Embeddable
public class McProductToDownloadPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="product_id")
	private Integer productId;

	@Column(name="download_id")
	private Integer downloadId;

	public McProductToDownloadPK() {
	}
	public Integer getProductId() {
		return this.productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public Integer getDownloadId() {
		return this.downloadId;
	}
	public void setDownloadId(Integer downloadId) {
		this.downloadId = downloadId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof McProductToDownloadPK)) {
			return false;
		}
		McProductToDownloadPK castOther = (McProductToDownloadPK)other;
		return 
			(this.productId == castOther.productId)
			&& (this.downloadId == castOther.downloadId);
	}

	public int hashCode() {
		final Integer prime = 31;
		Integer hash = 17;
		hash = hash * prime + this.productId;
		hash = hash * prime + this.downloadId;
		
		return hash;
	}
}
package com.megacart.domain.catalog;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the mc_download_description database table.
 * 
 */
@Embeddable
public class McDownloadDescriptionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="download_id")
	private Integer downloadId;

	@Column(name="language_id")
	private Integer languageId;

	public McDownloadDescriptionPK() {
	}
	public Integer getDownloadId() {
		return this.downloadId;
	}
	public void setDownloadId(Integer downloadId) {
		this.downloadId = downloadId;
	}
	public Integer getLanguageId() {
		return this.languageId;
	}
	public void setLanguageId(Integer languageId) {
		this.languageId = languageId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof McDownloadDescriptionPK)) {
			return false;
		}
		McDownloadDescriptionPK castOther = (McDownloadDescriptionPK)other;
		return 
			(this.downloadId == castOther.downloadId)
			&& (this.languageId == castOther.languageId);
	}

	public int hashCode() {
		final Integer prime = 31;
		Integer hash = 17;
		hash = hash * prime + this.downloadId;
		hash = hash * prime + this.languageId;
		
		return hash;
	}
}
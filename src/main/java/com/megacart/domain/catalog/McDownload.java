package com.megacart.domain.catalog;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the mc_download database table.
 * 
 */
@Entity
@Table(name="mc_download")
@NamedQuery(name="McDownload.findAll", query="SELECT m FROM McDownload m")
public class McDownload implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="download_id")
	private Integer downloadId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_added")
	private Date dateAdded;

	private String filename;

	private String mask;

	public McDownload() {
	}

	public Integer getDownloadId() {
		return this.downloadId;
	}

	public void setDownloadId(Integer downloadId) {
		this.downloadId = downloadId;
	}

	public Date getDateAdded() {
		return this.dateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}

	public String getFilename() {
		return this.filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getMask() {
		return this.mask;
	}

	public void setMask(String mask) {
		this.mask = mask;
	}

}
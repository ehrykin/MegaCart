package com.megacart.domain.tool;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the mc_upload database table.
 * 
 */
@Entity
@Table(name="mc_upload")
@NamedQuery(name="McUpload.findAll", query="SELECT m FROM McUpload m")
public class McUpload implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="upload_id")
	private Integer uploadId;

	private String code;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_added")
	private Date dateAdded;

	private String filename;

	private String name;

	public McUpload() {
	}

	public Integer getUploadId() {
		return this.uploadId;
	}

	public void setUploadId(Integer uploadId) {
		this.uploadId = uploadId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
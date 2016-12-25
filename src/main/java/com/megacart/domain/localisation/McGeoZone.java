package com.megacart.domain.localisation;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the mc_geo_zone database table.
 * 
 */
@Entity
@Table(name="mc_geo_zone")
@NamedQuery(name="McGeoZone.findAll", query="SELECT m FROM McGeoZone m")
public class McGeoZone implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="geo_zone_id")
	private Integer geoZoneId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_added")
	private Date dateAdded;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_modified")
	private Date dateModified;

	private String description;

	private String name;

	public McGeoZone() {
	}

	public Integer getGeoZoneId() {
		return this.geoZoneId;
	}

	public void setGeoZoneId(Integer geoZoneId) {
		this.geoZoneId = geoZoneId;
	}

	public Date getDateAdded() {
		return this.dateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}

	public Date getDateModified() {
		return this.dateModified;
	}

	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
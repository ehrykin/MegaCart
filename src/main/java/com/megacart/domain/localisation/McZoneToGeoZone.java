package com.megacart.domain.localisation;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the mc_zone_to_geo_zone database table.
 * 
 */
@Entity
@Table(name="mc_zone_to_geo_zone")
@NamedQuery(name="McZoneToGeoZone.findAll", query="SELECT m FROM McZoneToGeoZone m")
public class McZoneToGeoZone implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="zone_to_geo_zone_id")
	private Integer zoneToGeoZoneId;

	@Column(name="country_id")
	private Integer countryId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_added")
	private Date dateAdded;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_modified")
	private Date dateModified;

	@Column(name="geo_zone_id")
	private Integer geoZoneId;

	@Column(name="zone_id")
	private Integer zoneId;

	public McZoneToGeoZone() {
	}

	public Integer getZoneToGeoZoneId() {
		return this.zoneToGeoZoneId;
	}

	public void setZoneToGeoZoneId(Integer zoneToGeoZoneId) {
		this.zoneToGeoZoneId = zoneToGeoZoneId;
	}

	public Integer getCountryId() {
		return this.countryId;
	}

	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
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

	public Integer getGeoZoneId() {
		return this.geoZoneId;
	}

	public void setGeoZoneId(Integer geoZoneId) {
		this.geoZoneId = geoZoneId;
	}

	public Integer getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(Integer zoneId) {
		this.zoneId = zoneId;
	}

}
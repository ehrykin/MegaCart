package com.megacart.domain.localisation;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_location database table.
 * 
 */
@Entity
@Table(name="mc_location")
@NamedQuery(name="McLocation.findAll", query="SELECT m FROM McLocation m")
public class McLocation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="location_id")
	private Integer locationId;

	@Lob
	private String address;

	@Lob
	private String comment;

	private String fax;

	private String geocode;

	private String image;

	private String name;

	@Lob
	private String open;

	private String telephone;

	public McLocation() {
	}

	public Integer getLocationId() {
		return this.locationId;
	}

	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getGeocode() {
		return this.geocode;
	}

	public void setGeocode(String geocode) {
		this.geocode = geocode;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOpen() {
		return this.open;
	}

	public void setOpen(String open) {
		this.open = open;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

}
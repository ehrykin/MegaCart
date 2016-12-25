package com.megacart.domain.design;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_banner database table.
 * 
 */
@Entity
@Table(name="mc_banner")
@NamedQuery(name="McBanner.findAll", query="SELECT m FROM McBanner m")
public class McBanner implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="banner_id")
	private Integer bannerId;

	private String name;

	private byte status;

	public McBanner() {
	}

	public Integer getBannerId() {
		return this.bannerId;
	}

	public void setBannerId(Integer bannerId) {
		this.bannerId = bannerId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

}
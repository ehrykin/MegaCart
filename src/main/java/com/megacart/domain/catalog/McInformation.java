package com.megacart.domain.catalog;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_information database table.
 * 
 */
@Entity
@Table(name="mc_information")
@NamedQuery(name="McInformation.findAll", query="SELECT m FROM McInformation m")
public class McInformation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="information_id")
	private Integer informationId;

	private Integer bottom;

	@Column(name="sort_order")
	private Integer sortOrder;

	private byte status;

	public McInformation() {
	}

	public Integer getInformationId() {
		return this.informationId;
	}

	public void setInformationId(Integer informationId) {
		this.informationId = informationId;
	}

	public Integer getBottom() {
		return this.bottom;
	}

	public void setBottom(Integer bottom) {
		this.bottom = bottom;
	}

	public Integer getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(Integer sortOrder) {
		this.sortOrder = sortOrder;
	}

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

}
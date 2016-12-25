package com.megacart.domain.design;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_menu database table.
 * 
 */
@Entity
@Table(name="mc_menu")
@NamedQuery(name="McMenu.findAll", query="SELECT m FROM McMenu m")
public class McMenu implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="menu_id")
	private Integer menuId;

	private String link;

	@Column(name="sort_order")
	private Integer sortOrder;

	private byte status;

	@Column(name="store_id")
	private Integer storeId;

	private String type;

	public McMenu() {
	}

	public Integer getMenuId() {
		return this.menuId;
	}

	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}

	public String getLink() {
		return this.link;
	}

	public void setLink(String link) {
		this.link = link;
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

	public Integer getStoreId() {
		return this.storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
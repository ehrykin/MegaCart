package com.megacart.domain.design;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_menu_module database table.
 * 
 */
@Entity
@Table(name="mc_menu_module")
@NamedQuery(name="McMenuModule.findAll", query="SELECT m FROM McMenuModule m")
public class McMenuModule implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="menu_module_id")
	private Integer menuModuleId;

	private String code;

	@Column(name="menu_id")
	private Integer menuId;

	@Column(name="sort_order")
	private Integer sortOrder;

	public McMenuModule() {
	}

	public Integer getMenuModuleId() {
		return this.menuModuleId;
	}

	public void setMenuModuleId(Integer menuModuleId) {
		this.menuModuleId = menuModuleId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getMenuId() {
		return this.menuId;
	}

	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}

	public Integer getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(Integer sortOrder) {
		this.sortOrder = sortOrder;
	}

}
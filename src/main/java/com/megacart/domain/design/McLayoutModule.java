package com.megacart.domain.design;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_layout_module database table.
 * 
 */
@Entity
@Table(name="mc_layout_module")
@NamedQuery(name="McLayoutModule.findAll", query="SELECT m FROM McLayoutModule m")
public class McLayoutModule implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="layout_module_id")
	private Integer layoutModuleId;

	private String code;

	@Column(name="layout_id")
	private Integer layoutId;

	private String position;

	@Column(name="sort_order")
	private Integer sortOrder;

	public McLayoutModule() {
	}

	public Integer getLayoutModuleId() {
		return this.layoutModuleId;
	}

	public void setLayoutModuleId(Integer layoutModuleId) {
		this.layoutModuleId = layoutModuleId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getLayoutId() {
		return this.layoutId;
	}

	public void setLayoutId(Integer layoutId) {
		this.layoutId = layoutId;
	}

	public String getPosition() {
		return this.position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Integer getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(Integer sortOrder) {
		this.sortOrder = sortOrder;
	}

}
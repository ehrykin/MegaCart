package com.megacart.domain.design;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_layout database table.
 * 
 */
@Entity
@Table(name="mc_layout")
@NamedQuery(name="McLayout.findAll", query="SELECT m FROM McLayout m")
public class McLayout implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="layout_id")
	private Integer layoutId;

	private String name;

	public McLayout() {
	}

	public Integer getLayoutId() {
		return this.layoutId;
	}

	public void setLayoutId(Integer layoutId) {
		this.layoutId = layoutId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
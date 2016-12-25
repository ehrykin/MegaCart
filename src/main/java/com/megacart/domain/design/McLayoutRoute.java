package com.megacart.domain.design;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_layout_route database table.
 * 
 */
@Entity
@Table(name="mc_layout_route")
@NamedQuery(name="McLayoutRoute.findAll", query="SELECT m FROM McLayoutRoute m")
public class McLayoutRoute implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="layout_route_id")
	private Integer layoutRouteId;

	@Column(name="layout_id")
	private Integer layoutId;

	private String route;

	@Column(name="store_id")
	private Integer storeId;

	public McLayoutRoute() {
	}

	public Integer getLayoutRouteId() {
		return this.layoutRouteId;
	}

	public void setLayoutRouteId(Integer layoutRouteId) {
		this.layoutRouteId = layoutRouteId;
	}

	public Integer getLayoutId() {
		return this.layoutId;
	}

	public void setLayoutId(Integer layoutId) {
		this.layoutId = layoutId;
	}

	public String getRoute() {
		return this.route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	public Integer getStoreId() {
		return this.storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

}
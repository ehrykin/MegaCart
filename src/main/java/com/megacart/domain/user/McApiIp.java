package com.megacart.domain.user;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_api_ip database table.
 * 
 */
@Entity
@Table(name="mc_api_ip")
@NamedQuery(name="McApiIp.findAll", query="SELECT m FROM McApiIp m")
public class McApiIp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="api_ip_id")
	private Integer apiIpId;

	@Column(name="api_id")
	private Integer apiId;

	private String ip;

	public McApiIp() {
	}

	public Integer getApiIpId() {
		return this.apiIpId;
	}

	public void setApiIpId(Integer apiIpId) {
		this.apiIpId = apiIpId;
	}

	public Integer getApiId() {
		return this.apiId;
	}

	public void setApiId(Integer apiId) {
		this.apiId = apiId;
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

}
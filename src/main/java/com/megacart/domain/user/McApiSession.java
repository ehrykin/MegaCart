package com.megacart.domain.user;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the mc_api_session database table.
 * 
 */
@Entity
@Table(name="mc_api_session")
@NamedQuery(name="McApiSession.findAll", query="SELECT m FROM McApiSession m")
public class McApiSession implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="api_session_id")
	private Integer apiSessionId;

	@Column(name="api_id")
	private Integer apiId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_added")
	private Date dateAdded;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_modified")
	private Date dateModified;

	private String ip;

	@Column(name="session_id")
	private String sessionId;

	@Column(name="session_name")
	private String sessionName;

	private String token;

	public McApiSession() {
	}

	public Integer getApiSessionId() {
		return this.apiSessionId;
	}

	public void setApiSessionId(Integer apiSessionId) {
		this.apiSessionId = apiSessionId;
	}

	public Integer getApiId() {
		return this.apiId;
	}

	public void setApiId(Integer apiId) {
		this.apiId = apiId;
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

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getSessionId() {
		return this.sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getSessionName() {
		return this.sessionName;
	}

	public void setSessionName(String sessionName) {
		this.sessionName = sessionName;
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}
package com.megacart.domain.extension;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the mc_event database table.
 * 
 */
@Entity
@Table(name="mc_event")
@NamedQuery(name="McEvent.findAll", query="SELECT m FROM McEvent m")
public class McEvent implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="event_id")
	private Integer eventId;

	@Lob
	private String action;

	private String code;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_added")
	private Date dateAdded;

	private byte status;

	@Lob
	private String trigger;

	public McEvent() {
	}

	public Integer getEventId() {
		return this.eventId;
	}

	public void setEventId(Integer eventId) {
		this.eventId = eventId;
	}

	public String getAction() {
		return this.action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Date getDateAdded() {
		return this.dateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

	public String getTrigger() {
		return this.trigger;
	}

	public void setTrigger(String trigger) {
		this.trigger = trigger;
	}

}
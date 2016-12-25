package com.megacart.domain.report;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the mc_return_history database table.
 * 
 */
@Entity
@Table(name="mc_return_history")
@NamedQuery(name="McReturnHistory.findAll", query="SELECT m FROM McReturnHistory m")
public class McReturnHistory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="return_history_id")
	private Integer returnHistoryId;

	@Lob
	private String comment;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_added")
	private Date dateAdded;

	private byte notify;

	@Column(name="return_id")
	private Integer returnId;

	@Column(name="return_status_id")
	private Integer returnStatusId;

	public McReturnHistory() {
	}

	public Integer getReturnHistoryId() {
		return this.returnHistoryId;
	}

	public void setReturnHistoryId(Integer returnHistoryId) {
		this.returnHistoryId = returnHistoryId;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Date getDateAdded() {
		return this.dateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}

	public byte getNotify() {
		return this.notify;
	}

	public void setNotify(byte notify) {
		this.notify = notify;
	}

	public Integer getReturnId() {
		return this.returnId;
	}

	public void setReturnId(Integer returnId) {
		this.returnId = returnId;
	}

	public Integer getReturnStatusId() {
		return this.returnStatusId;
	}

	public void setReturnStatusId(Integer returnStatusId) {
		this.returnStatusId = returnStatusId;
	}

}
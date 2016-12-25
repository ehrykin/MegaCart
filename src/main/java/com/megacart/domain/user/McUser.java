package com.megacart.domain.user;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the mc_user database table.
 * 
 */
@Entity
@Table(name="mc_user")
@NamedQuery(name="McUser.findAll", query="SELECT m FROM McUser m")
public class McUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="user_id")
	private Integer userId;

	private String code;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_added")
	private Date dateAdded;

	private String email;

	private String firstname;

	private String image;

	private String ip;

	private String lastname;

	private String password;

	private String salt;

	private byte status;

	@Column(name="user_group_id")
	private Integer userGroupId;

	private String username;

	public McUser() {
	}

	@Override
	public String toString() {
		return "McUser [userId=" + userId + ", code=" + code + ", dateAdded=" + dateAdded + ", email=" + email
				+ ", firstname=" + firstname + ", image=" + image + ", ip=" + ip + ", lastname=" + lastname
				+ ", password=" + password + ", salt=" + salt + ", status=" + status + ", userGroupId=" + userGroupId
				+ ", username=" + username + "]";
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
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

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSalt() {
		return this.salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

	public Integer getUserGroupId() {
		return this.userGroupId;
	}

	public void setUserGroupId(Integer userGroupId) {
		this.userGroupId = userGroupId;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
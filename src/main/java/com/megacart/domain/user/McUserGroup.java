package com.megacart.domain.user;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mc_user_group database table.
 * 
 */
@Entity
@Table(name="mc_user_group")
@NamedQuery(name="McUserGroup.findAll", query="SELECT m FROM McUserGroup m")
public class McUserGroup implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="user_group_id")
	private Integer userGroupId;

	private String name;

	@Lob
	private String permission;

	public McUserGroup() {
	}

	public Integer getUserGroupId() {
		return this.userGroupId;
	}

	public void setUserGroupId(Integer userGroupId) {
		this.userGroupId = userGroupId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPermission() {
		return this.permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}

}
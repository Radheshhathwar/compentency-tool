package com.sphere.compentencytool.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="roledesignationmap",schema="public")
public class RoleDesignationMap {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="role_id")
	private String role_id;
	
	@Column(name="designation_id")
	private String designation_id;
	
	public RoleDesignationMap() {
		super();
	}
	
	public RoleDesignationMap(long id, String role_id, String designation_id) {
		super();
		this.id = id;
		this.role_id = role_id;
		this.designation_id = designation_id;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRole_id() {
		return role_id;
	}

	public void setRole_id(String role_id) {
		this.role_id = role_id;
	}

	public String getDesignation_id() {
		return designation_id;
	}

	public void setDesignation_id(String designation_id) {
		this.designation_id = designation_id;
	}
	
}

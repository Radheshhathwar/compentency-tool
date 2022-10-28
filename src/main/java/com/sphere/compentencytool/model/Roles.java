package com.sphere.compentencytool.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="Roles",schema="public")
public class Roles {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="role_id")
	private String role_id;
	
	@Column(name="role_name")
	private String role_name;
	
	@Column(name="role_description")
	private String role_description;
	
	@Column(name="status")
	private long status;
	
	@Column(name="createdon")
	private Timestamp createdon;
	
	@Column(name="createdby")
	private String createdby;
	
	public Roles() {
		super();
	}
	
	public Roles(long id, String role_id, String role_name, String role_description, long status, Timestamp createdon,
			String createdby) {
		super();
		this.id = id;
		this.role_id = role_id;
		this.role_name = role_name;
		this.role_description = role_description;
		this.status = status;
		this.createdon = createdon;
		this.createdby = createdby;
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
	public String getRole_name() {
		return role_name;
	}
	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}
	public String getRole_description() {
		return role_description;
	}
	public void setRole_description(String role_description) {
		this.role_description = role_description;
	}
	public long getStatus() {
		return status;
	}
	public void setStatus(long status) {
		this.status = status;
	}
	public Timestamp getCreatedon() {
		return createdon;
	}
	public void setCreatedon(Timestamp createdon) {
		this.createdon = createdon;
	}
	public String getCreatedby() {
		return createdby;
	}
	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}
	
	
	
	
}

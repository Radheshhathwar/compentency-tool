package com.sphere.compentencytool.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Designations",schema="public")
public class Designations {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="designation_id")
	private String designation_id;
	
	@Column(name="designation_name")
	private String designation_name;
	
	@Column(name="designation_description")
	private String designation_description;
	
	@Column(name="status")
	private long status;
	
	@Column(name="createdon")
	private Timestamp createdon;
	
	@Column(name="createdby")
	private String createdby;
	
	public Designations() {
		super();
	}
	
	public Designations(long id, String designation_id, String designation_name, String designation_description,
			long status, Timestamp createdon, String createdby) {
		super();
		this.id = id;
		this.designation_id = designation_id;
		this.designation_name = designation_name;
		this.designation_description = designation_description;
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
	public String getDesignation_id() {
		return designation_id;
	}
	public void setDesignation_id(String designation_id) {
		this.designation_id = designation_id;
	}
	public String getDesignation_name() {
		return designation_name;
	}
	public void setDesignation_name(String designation_name) {
		this.designation_name = designation_name;
	}
	public String getDesignation_description() {
		return designation_description;
	}
	public void setDesignation_description(String designation_description) {
		this.designation_description = designation_description;
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

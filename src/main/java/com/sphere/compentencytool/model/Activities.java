package com.sphere.compentencytool.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "activities", schema = "public")
public class Activities {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "activity_id")
	private String activity_id;

	@Column(name = "activity_name")
	private String activity_name;

	@Column(name = "activity_description")
	private String activity_description;

	@Column(name = "status")
	private long status;

	@Column(name = "createdon")
	private Timestamp createdon;

	@Column(name = "createdby")
	private String createdby;

	public Activities() {
		super();
	}

	public Activities(long id, String activity_id, String activity_name, String activity_description, long status,
			Timestamp createdon, String createdby) {
		super();
		this.id = id;
		this.activity_id = activity_id;
		this.activity_name = activity_name;
		this.activity_description = activity_description;
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

	public String getActivity_id() {
		return activity_id;
	}

	public void setActivity_id(String activity_id) {
		this.activity_id = activity_id;
	}

	public String getActivity_name() {
		return activity_name;
	}

	public void setActivity_name(String activity_name) {
		this.activity_name = activity_name;
	}

	public String getActivity_description() {
		return activity_description;
	}

	public void setActivity_description(String activity_description) {
		this.activity_description = activity_description;
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

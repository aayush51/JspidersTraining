package com.qsp.hospital;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Doctor {
	@Id
	private int id;
	private String name;
	private String qualification;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public Doctor() {
		super();
	}

}

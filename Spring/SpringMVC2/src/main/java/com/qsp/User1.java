package com.qsp;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User1 {
	
	@Id
	private String id;
	private String name;
	private String phone;
	
	
	public User1() {
		super();
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}
	

	

}

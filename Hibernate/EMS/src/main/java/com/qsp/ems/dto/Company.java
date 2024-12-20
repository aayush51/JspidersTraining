package com.qsp.ems.dto;
// Data Transfer Object
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Company {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String location;

	@OneToMany(cascade = CascadeType.ALL,mappedBy = "company")
	private List<Employee> employees;

	public int getId() {
		return id;
	}
//
//	public void setId(int id) {
//		this.id = id;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public Company() {
		super();
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", location=" + location + ", employees=" + employees + "]";
	}

}

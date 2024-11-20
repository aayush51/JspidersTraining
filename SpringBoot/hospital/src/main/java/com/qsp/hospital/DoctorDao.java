package com.qsp.hospital;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DoctorDao {
	@Autowired
	DoctorRepository repository;

	public Doctor saveDoctor(Doctor doctor) {
		return repository.save(doctor);
	}

	public Doctor getDoctorById(int id) {
		Optional<Doctor> op = repository.findById(id);
		if (op.isPresent()) {
			return op.get();
		}
		return null;
	}

	public List<Doctor> getDoctorByName(String name) {
		return repository.findByName(name);
	}

	public List<Doctor> getAllDoctor() {
		return repository.findAll();
	}

	public Doctor updateDoctor(Doctor doctor) {
		return repository.save(doctor);
	}

	public String deleteDoctorByName(String name) {

		int n = repository.deleteDoctorByName(name);
		if(n==0) {
			return "Doctor " + name + " Not Deleted";
		}
		return "Doctor " + name + " Deleted";
	}

}

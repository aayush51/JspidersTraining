package com.qsp.hospital;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorController {
	
	@Autowired
	DoctorDao dao;
	
	@PostMapping("/doctor")
	public Doctor saveDoctor(@RequestBody Doctor doctor) {
		return dao.saveDoctor(doctor);
	}
	
	@GetMapping("/doctor/{id}")
	public Doctor getDoctorById(@PathVariable int id) {
		return dao.getDoctorById(id);
	}
	
	@GetMapping("/doctor")
	public List<Doctor> getAllDoctors(){
		return dao.getAllDoctor();
	}
	
	@PutMapping("/doctor")
	public Doctor updateDoctor(@RequestBody Doctor doctor) {
		return dao.updateDoctor(doctor);
	}
	
	@DeleteMapping("/doctor/{name}")
	public String deleteDoctorByName(@PathVariable String name) {
		return dao.deleteDoctorByName(name);
	}

}

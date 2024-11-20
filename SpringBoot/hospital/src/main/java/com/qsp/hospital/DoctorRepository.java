package com.qsp.hospital;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import jakarta.transaction.Transactional;

public interface DoctorRepository extends JpaRepository<Doctor, Integer>{
	
	List<Doctor> findByName(String name);
	
	@Modifying	//modify db
	@Transactional	// use  transactional
	@Query("delete from Doctor d where d.name in (?1)")
	int deleteDoctorByName(String name);
}

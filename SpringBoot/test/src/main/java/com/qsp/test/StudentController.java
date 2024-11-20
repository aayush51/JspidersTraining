package com.qsp.test;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/qsp/deccan")
@RestController
public class StudentController {
	
	@GetMapping("/save")
	public String saveStudent() {
		return "saved";
	}
	
	@GetMapping("/get")
	public String getStudent() {
		return "Student";
	}
	

}

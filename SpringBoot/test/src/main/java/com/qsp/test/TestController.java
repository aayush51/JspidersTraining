package com.qsp.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/hi")
	public String getMsg() {
		return "Byeeee";
	}

	@GetMapping("/sendName")
	public String getMahesh() {
		return "Mahesh";
	}
	
	@GetMapping("/getId")
	public int getId(@RequestParam int id) {
		return id ;
	}
	
	@GetMapping("/getId/{id}")
	public int getIdByPath(@PathVariable int id) {
		return id ;
	}

	@GetMapping("/info")
	public String info1(@RequestParam int id, @RequestParam String name) {
		return id + " " + name;
	}

	@GetMapping("/info/{id}/{name}")
	public String info2(@PathVariable int id, @PathVariable String name) {
		return id + " " + name;
	}
	
	@GetMapping("/info/")
	public String info3(@RequestParam long phone, @RequestParam String email) {
		return "Phone:" + phone + " ,Email:" + email;
	}
	
	@GetMapping("/info/{phone}/{email}")
	public String info4(@PathVariable long phone, @PathVariable String email) {
		return "Phone:" + phone + " ,Email:" + email;
	}
	
	
	
	

}

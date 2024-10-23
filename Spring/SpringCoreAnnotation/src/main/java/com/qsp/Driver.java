package com.qsp;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext ac = new AnnotationConfigApplicationContext(myConfig.class);
		Student student = (Student) ac.getBean("student");
		student.study();
		
		Person person = (Person) ac.getBean("person");
		person.hi();
		
		ac.close();
	}

}

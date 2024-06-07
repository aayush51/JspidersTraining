package ConstructorOverloading;

public class Form {

	String name;
	String email;
	long phone;
	String address;
	String bloodGroup;
	double height;
	double weight;

	// No Args Constructor
	Form() {
		System.out.println("from no arg constructor");
	}
	
	Form(String name) {
		this.name = name;
	}
	
	Form(String name, String email) {
		this.name = name;
		this.email = email;
	}

	// Parameterized Constructor
	Form(String name, String email, long phone, String address, String blood, double height, double weight) {
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.address = address;
		bloodGroup = blood;
		this.height = height;
		this.weight = weight;
	}
	
	public void displayForm() {
		System.out.println("Name: " + name);
		System.out.println("Email: " + email);
		System.out.println("Phone: " + phone);
		System.out.println("Address: " + address);
		System.out.println("Blood Group: " + bloodGroup);
		System.out.println("Height: " + height);
		System.out.println("Weight: " + weight);
	}
}

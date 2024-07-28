package ConstructorChaining;

public class Form {
	
	String name;
	String email;
	long contact;
	String address;
	String bloodGroup;
	double height;
	double weight;
	//Constructor Chaining using this call Statement
	public Form() {
	     this("Unknown", "Unknown", 0, "Unknown", "Unknown", 0.0, 0.0);
	 }

	 // Constructor for all fields
	 public Form(String name, String email, long contact, String address, String bloodGroup, double height, double weight) {
	     this.name = name;
	     this.email = email;
	     this.contact = contact;
	     this.address = address;
	     this.bloodGroup = bloodGroup;
	     this.height = height;
	     this.weight = weight;
	 }

	 // Other constructors can chain to the all-fields constructor
	 public Form(String name, String email) {
	     this(name, email, 0, "Unknown", "Unknown", 0.0, 0.0);
	 }

	 public Form(String name, String email, long contact) {
	     this(name, email, contact, "Unknown", "Unknown", 0.0, 0.0);
	 }

	
	
	public void displayForm() {
		System.out.println("Name: " + name);
		System.out.println("Email: " + email);
		System.out.println("Contact: " + contact);
		System.out.println("Address: " + address);
		System.out.println("Blood Group: " + bloodGroup);
		System.out.println("Height: " + height);
		System.out.println("Weight: " + weight);
	}

}

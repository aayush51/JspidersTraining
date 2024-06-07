package Inheritance.MultiLevel.Qspiders;

public class TestYantra {
	String name;
	String hq;
	String ceo;
	int noOfEmployees;
	String type;
	
	public TestYantra()
	{
		
	}
	
	public TestYantra(String name, String hq, String ceo, int noOfEmployees, String type) {
		this.name = name;
		this.hq = hq;
		this.ceo = ceo;
		this.noOfEmployees = noOfEmployees;
		this.type = type;
	}
	
	public void displayTestYantraDetails() {
		System.out.println("Name: " + name);
		System.out.println("Head Quarters: " + hq);
		System.out.println("CEO: " + ceo);
		System.out.println("No of Employees: " + noOfEmployees);
		System.out.println("Type: " + type);
	}
}

package Inheritance.MultiLevel.Qspiders;

public class Qspiders extends TestYantra {
	String domain;
	int noOfCenters;
	
	public Qspiders()
	{
		
	}
	
	public Qspiders(String name, String hq, String ceo, int noOfEmployees, String type, String domain,
			int noOfCenters) {
		this.name = name;
		this.hq = hq;
		this.ceo = ceo;
		this.noOfEmployees = noOfEmployees;
		this.type = type;
		this.domain = domain;
		this.noOfCenters = noOfCenters;
	}
	
	public void displayQspidersDetails() {
		displayTestYantraDetails();
		System.out.println("Domain: " + domain);
		System.out.println("No of Centers: " + noOfCenters);
	}
	
}

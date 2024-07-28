package Inheritance.MultiLevel.Qspiders;

public class QspidersDeccan extends Qspiders {
	String head;
	int trainersCount;
	String location;
	
	public QspidersDeccan() {

	}
	
	QspidersDeccan(String name, String hq, String ceo, int noOfEmployees, String type, String domain, int noOfCenters,
			String head, int trainersCount, String location) {
		this.name = name;
		this.hq = hq;
		this.ceo = ceo;
		this.noOfEmployees = noOfEmployees;
		this.type = type;
		this.domain = domain;
		this.noOfCenters = noOfCenters;
		this.head = head;
		this.trainersCount = trainersCount;
		this.location = location;
	}
	
	public void displayQspidersDeccanDetails() {
		displayQspidersDetails();
		System.out.println("Head: " + head);
		System.out.println("Trainers Count: " + trainersCount);
		System.out.println("Location: " + location);
	}
	
}

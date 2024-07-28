package Inheritance.MultiLevel.Qspiders;

public class QSPDriver {
	public static void main(String[] args) {
		QspidersDeccan qd = new QspidersDeccan("Test Yantra Software Solutions", "Bengluru", "Girish Ramanna", 4000, "Software Company", 
				"Software Training Institute", 5,"Kedarnath", 10, "Deccan Pune MH");
		qd.displayQspidersDeccanDetails();
		System.out.println("=========================================");
		qd.displayQspidersDetails();
		System.out.println("=========================================");
		qd.displayTestYantraDetails();
	}

}

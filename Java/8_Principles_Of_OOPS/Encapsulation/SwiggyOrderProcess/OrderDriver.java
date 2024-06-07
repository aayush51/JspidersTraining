package Encapsulation.SwiggyOrderProcess;

public class OrderDriver {
	
	public static void main(String[] args) {
		Order o1 = new Order(1, "2021-09-01", "Rahul", "500");

		o1.displayOrderDetails();
		System.out.println("----------------------------------------------");

		o1.setOrderAmount("700");
		o1.displayOrderDetails();
		System.out.println("----------------------------------------------");

	}

}

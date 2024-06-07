package Encapsulation.OnlineProductManage;

public class ProductDriver {

	public static void main(String[] args) {
		Product p1 = new Product(1, "Laptop", 50000, 10);

		p1.displayProductDetails();
		System.out.println("----------------------------------------------");

		p1.setPrice(60000);
		p1.displayProductDetails();
		System.out.println("----------------------------------------------");

		p1.setStock(20);
		p1.displayProductDetails();
		System.out.println("----------------------------------------------");
		
		Product p2 = new Product(2, "Mobile", 20000, 5);
		p2.displayProductDetails();

	}

}

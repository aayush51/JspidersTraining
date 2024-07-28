package LazyBinding.ProductCart;

public class Cart {
	
	String CustomerName;
	int TotalPrice;
	int TotalQuantity;
	
	Product p1;

	public Cart() {

	}

	Cart(String name, String customer, int price, int quantity) {
		CustomerName = customer;
		TotalPrice = price;
		TotalQuantity = quantity;
	}
	
	public void insertProduct(String name, String brand, int price, int quantity) {
		p1 = new Product(name, brand, price, quantity);

		System.out.println("Product inserted successfully");

		TotalPrice += price*quantity;
		TotalQuantity += quantity;
	}

	public void showCart() {
		System.out.println("Customer Name: " + CustomerName);
		System.out.println("Total Price: " + TotalPrice);
		System.out.println("Total Quantity: " + TotalQuantity);
	}

}

package LazyBinding.ProductCart;

public class Product {
	String ProductName;
	String Brand;
	int Price;
	int Quantity;

	public Product() {

	}

	Product(String name, String brand, int price, int quantity) {
		ProductName = name;
		Brand = brand;
		Price = price;
		Quantity = quantity;
	}

	public void showProduct() {
		System.out.println("Product Name: " + ProductName);
		System.out.println("Brand: " + Brand);
		System.out.println("Price: " + Price);
		System.out.println("Quantity: " + Quantity);
	}

}

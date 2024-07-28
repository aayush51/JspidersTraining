package Encapsulation.OnlineProductManage;

//Objective: Develop a Product class for an e-commerce application.
//
//Private fields: productId, productName, price, stock
//Public methods: getProductId(), getProductName(), getPrice(), getStock(), setPrice(double price), setStock(int stock)


public class Product {

	private int productId;
	private String productName;
	private double price;
	private int stock;

	public Product() {

	}

	public Product(int productId, String productName, double price, int stock) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.stock = stock;
	}

	public int getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public double getPrice() {
		return price;
	}

	public int getStock() {
		return stock;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public void displayProductDetails() {
		System.out.println("Product ID: " + productId);
		System.out.println("Product Name: " + productName);
		System.out.println("Price: " + price);
		System.out.println("Stock: " + stock);
	}

}

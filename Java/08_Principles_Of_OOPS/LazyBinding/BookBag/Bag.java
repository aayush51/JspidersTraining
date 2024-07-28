package LazyBinding.BookBag;

public class Bag {
	String BagName;
	String Brand;
	int Price;
	int Capacity;
	
	Book b1;
	
	public Bag() {

	}
	
	Bag(String name, String brand, int price, int capacity) {
		BagName = name;
		Brand = brand;
		Price = price;
		Capacity = capacity;
	}
	
	public void insertBook(String name, String author, int price, int pages) {
		b1 = new Book(name, author, price, pages);
		
		System.out.println("Book inserted successfully");
		
		Capacity--;
	}
	
	public void showBag() {
		System.out.println("Bag Name: " + BagName);
		System.out.println("Brand: " + Brand);
		System.out.println("Price: " + Price);
		System.out.println("Capacity: " + Capacity);
	}

}

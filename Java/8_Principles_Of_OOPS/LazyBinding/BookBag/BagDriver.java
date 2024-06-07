package LazyBinding.BookBag;

public class BagDriver {
	
	public static void main(String[] args) {
		Bag b = new Bag("Backpack", "Nike", 1500, 5);
		b.showBag();
		
		System.out.println("--------------------------------");
		
		b.insertBook("Java", "James Gosling", 500, 1000);
		
		System.out.println("--------------------------------");
		
		b.b1.showBook();
		
		System.out.println("--------------------------------");
		
		b.showBag();
	}	

}

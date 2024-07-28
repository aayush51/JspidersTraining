package EarlyBinding.PageNotebook;

public class Notebook {
	String brand;
	int noOfPages;
	double price;
	
	Page p1;
	
	public Notebook() {

	}
	
	Notebook(String brand, int noOfPages, double price, boolean singleLined, boolean doubleLined, boolean squared,
			boolean blank, int height, int width) {
		this.brand = brand;
		this.noOfPages = noOfPages;
		this.price = price;
		p1 = new Page(singleLined, doubleLined, squared, blank, height, width);
	}
	
	void displayNotebook() {
		System.out.println("Brand: " + brand);
		System.out.println("No of Pages: " + noOfPages);
		System.out.println("Price: " + price);
		p1.displayPage();
	}

}

package EarlyBinding.PageNotebook;

public class Page {
	boolean singleLined;
	boolean doubleLined;
	boolean squared;
	boolean blank;
	int height;
	int width;
	
	public Page() {

	}
	
	Page(boolean singleLined, boolean doubleLined, boolean squared, boolean blank, int height, int width) {
		this.singleLined = singleLined;
		this.doubleLined = doubleLined;
		this.squared = squared;
		this.blank = blank;
		this.height = height;
		this.width = width;
	}
	
	void displayPage() {
		System.out.println("Single Lined: " + singleLined);
		System.out.println("Double Lined: " + doubleLined);
		System.out.println("Squared: " + squared);
		System.out.println("Blank: " + blank);
		System.out.println("Height: " + height);
		System.out.println("Width: " + width);
	}

}

package MethodChaining;

public class FruitDriver {
	
	public static void main(String[] args) {
		Fruit f1 = new Fruit();
		f1.showName().showPrice().showColor().showTaste();

		System.out.println("-------------------------------------------");

		Fruit f2 = new Fruit("Apple", 100, "Red", "Sweet");
		f2.showName().showPrice().showColor().showTaste();
	}

}

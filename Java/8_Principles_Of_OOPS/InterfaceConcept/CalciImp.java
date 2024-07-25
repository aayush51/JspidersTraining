package InterfaceConcept;

public class CalciImp implements Calculator {
	
	String name;
	String brand;
	double price;
	
	public CalciImp(String name, String brand, double price) {
		this.name = name;
		this.brand = brand;
		this.price = price;
	}

	@Override
	public int add(int a, int b) {
		
		return a+b;
	}

	@Override
	public int subtract(int a, int b) {
		return a-b;
	}

	@Override
	public int multiply(int a, int b) {
		return a*b;
	}

	@Override
	public int divide(int a, int b) {
		return a/b;
	}

	@Override
	public double areaOfCircle(int radius) {
		return 2*pi*radius;
	}
	
}

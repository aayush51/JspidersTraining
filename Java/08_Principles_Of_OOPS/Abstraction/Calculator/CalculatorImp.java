package Abstraction.Calculator;

public class CalculatorImp extends Calculator {

	@Override
	public void add(int a, int b) {
		System.out.println("Addition of " + a + " and " + b + " is: " + (a + b));
	}

	@Override
	public void subtract(int a, int b) {
		System.out.println("Subtraction of " + a + " and " + b + " is: " + (a - b));
	}

	@Override
	public void multiply(int a, int b) {
		System.out.println("Multiplication of " + a + " and " + b + " is: " + (a * b));
	}

	@Override
	public void divide(int a, int b) {
		System.out.println("Division of " + a + " and " + b + " is: " + (a / b));
	}
	
	public void message() {
		System.out.println("This is a unnecessary message from CalculatorImp");
	}

}

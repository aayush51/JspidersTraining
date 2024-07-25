package Abstraction.Calculator;

public class CalculatorDriver {
	
	public static void main(String[] args) {
        Calculator c = new CalculatorImp(); //Up casting
//        c.message();
        c.greetings();
        c.add(10, 20);
        c.subtract(20, 10);
        c.multiply(10, 20);
        c.divide(20, 10);
        
        System.out.println("-------------------------------");
	}
}

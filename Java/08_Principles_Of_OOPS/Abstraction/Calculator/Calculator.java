package Abstraction.Calculator;

public abstract class Calculator {
	    
        public abstract void add(int a, int b);
        
        public abstract void subtract(int a, int b);
        
        public abstract void multiply(int a, int b);
        
        public abstract void divide(int a, int b);
        
		public void greetings() {
			System.out.println("Welcome To Calculator");
		}

}

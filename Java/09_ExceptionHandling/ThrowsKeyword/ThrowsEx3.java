package ThrowsKeyword;

public class ThrowsEx3 {
	
	public static void division(int a, int b) throws ArithmeticException {
		int c = a / b;
		System.out.println("Result: " + c);
	}

	public static void main(String[] args) {
		
		division(10, 2);
		
//		try 
//		{
//			division(10, 0);
//		} 
//		catch (ArithmeticException e) 
//		{
//			System.out.println("Exception Caught: " + e);
//		}
//		finally {
//			System.out.println("From Finally Block");
//		}
//		
		System.out.println("End of the program");
	}

}

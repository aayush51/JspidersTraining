package ThrowsKeyword;

public class ThrowsEx2 {

	//throws keyword is used to declare an exception
	//Example of throws keyword with checked exception
	
	public static void method1() throws InterruptedException {
		for(int i=1;i<=10;i++) {
			System.out.println("Hello "+i);
			Thread.sleep(1000);
		}
	}
	
	public static void method2() { // method called throws an exception but not caught here
		System.out.println(0/0);
	}
	
	public static void main(String[] args) {
		try
		{
			method1();
			method2(); //method calling exception caught here
					   //Exception object propagated to the calling the method
		}
		
		catch (ArithmeticException ae1 ) 
		{
			System.out.println(ae1 + " Exception Caught");
		}
		
		catch (InterruptedException e) {
			System.out.println(e + " Exception Caught");
		}
		
//		catch (Exception e) 
//		{
//			System.out.println(e);
//		}

		finally {
			System.out.println("From Finally Block");
		}
		
		System.out.println("End of the program");
	}
		
}

package FinallyBlock;

public class FinallyEx1 {

	public static void main(String[] args) {
		
		try 
		{
			int a = 10 / 0;
			System.out.println(a);
		} 
		
		catch (ArithmeticException e) 
		{
			System.out.println("Arithmetic Exception");
		} 
		
		finally 
		{
			System.out.println("From Finally Block");
		}
		
	}

}

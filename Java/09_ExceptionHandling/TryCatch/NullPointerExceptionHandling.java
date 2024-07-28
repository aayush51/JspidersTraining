package TryCatch;

public class NullPointerExceptionHandling {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		ArithmeticExceptionHandling exp = null ;
		try
		{
			exp.Display();
		}
		catch (NullPointerException npe)
		{
			System.out.println("Cant access non static members with null reference");
		}
	}

}

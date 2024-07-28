package FinallyBlock;

public class FinallyEx2 {

	public static void main(String[] args) {
		try 
		{
			for (int i = 1; i <= 10; i++) {
				System.out.println("Hello" + i);
				Thread.sleep(1000); 
			}

		} 
		
		catch (Exception e) 
		{
			System.out.println(e.getClass()+" Exception Occured");
		} 
		
		finally 
		{
			System.out.println("From Finally Block");
		}
	}

}

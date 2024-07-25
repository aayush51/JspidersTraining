package ThrowsKeyword;

public class ThrowsEx1 {
	public static void main(String[] args) throws InterruptedException {
		
		for (int i = 1; i <= 10; i++) 
		{
			System.out.println("Hello" + i);
			Thread.sleep(1000);
		}
		
		System.out.println("End of the program");
		
	}
	
}

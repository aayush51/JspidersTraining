package TryCatch;
import java.util.Scanner;

public class ArithmeticExceptionHandling {
	public void Display()
	{
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int n1 = scanner.nextInt();
		System.out.println("Enter Second Number : ");
		int n2 = scanner.nextInt();
		
		try {

			int result = n1 / n2 ;
			System.out.println("Division of "+n1+" by "+n2+" is "+result);
		}
		catch (ArithmeticException ae) {
			System.out.println("Dont divide by Zero!");
		}
		System.out.println("End OF Program!");
	}
	

}

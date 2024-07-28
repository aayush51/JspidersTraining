package TryCatch;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionHandling {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		try
		{
			System.out.println("Enter First Number :");
			int n1 =  sc.nextInt();
			
			System.out.println("Enter Second Number :");
			int n2 = sc.nextInt();
			
			int result = n1 / n2;
			System.out.println(result);
		}
		catch (InputMismatchException ime)
		{
			System.out.println("Please enter a valid Input");		
		}
		
	}

}

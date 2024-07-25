package TryCatch;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchBlocks {
	public static void main(String[] args) {
		try {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter First Number:");
			int n1 = sc.nextInt();
			System.out.println("Enter Second Number:");
			int n2 = sc.nextInt();
			
			int result = n1 / n2;
			System.out.println(result);
		}
		catch (ArithmeticException ae) {
			System.out.println("Dont Divide by zero!");
		}
		catch (InputMismatchException ime) {
			System.out.println("Enter Valid Input!");
		}
		catch (NullPointerException npe) {
			System.out.println("Dont access with nnull reference!");
		}
				
	}

}

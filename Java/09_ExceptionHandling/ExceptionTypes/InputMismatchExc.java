package ExceptionTypes;
import java.util.Scanner;

public class InputMismatchExc {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		// Giving a string input will throw an InputMismatchException 
		
		System.out.println("The number is: " + num);
		sc.close();
	}
	
	
}

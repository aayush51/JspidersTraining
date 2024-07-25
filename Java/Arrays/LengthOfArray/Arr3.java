package LengthOfArray;
import java.util.*;

public class Arr3 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the How many friends you have :");
		int n = s.nextInt();
		String[] arr = new String[n];
		
		System.out.println("Enter the names of your friends :");
		s.nextLine();
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextLine();
		}
		
		System.out.println("The names of your friends are :");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		s.close();
	}
}

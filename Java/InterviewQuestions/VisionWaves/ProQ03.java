package VisionWaves;

import java.util.Scanner;

public class ProQ03 {
	
//	Q3] Find sum and product of even indices in array
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array : ");
		int size = sc.nextInt();
		System.out.println("Enter Elements of Array : ");
		int[] ar = new int[size];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		
		int sum = 0;
		int product = 1;
		for (int i = 0; i < ar.length; i++) {
			if(i%2==0) {
				sum+=ar[i];
				product*=ar[i];
			}
		}
		
		System.out.println("Sum and Product of given array for even indices -");
		System.out.println("sum: " + sum);
		System.out.println("product: " + product);
		
		sc.close();
	}

}

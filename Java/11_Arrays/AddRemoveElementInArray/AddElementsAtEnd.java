package AddRemoveElementInArray;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementsAtEnd {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] a = {10,20,30,40};
		System.out.println("Enter Number Of Elements To be Added in Array :");
		int num = sc.nextInt();
		int [] b = new int[a.length+num];
		System.out.println("Enter Element To Be Added :");
		for (int i = 0; i < b.length ; i++) {
			if(i<a.length)
			{
				b[i] = a[i];
			}
			else
			{
				b[i] = sc.nextInt();
			}
		}
		sc.close();
		System.out.println(Arrays.toString(b));
		
	}

}

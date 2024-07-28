package Searching;
import java.util.*;
public class LinearSearch1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] a = {22,5,6,99,74,11,52,36,58,41};
		
		System.out.println("Enter value to scan :");
		int val = sc.nextInt();	
		
		sc.close();
		
		int i = 0;
		for (; i < a.length; i++) 
		{
			if(a[i] == val)
			{
				break;
			}
		}
		if(i!=a.length-1)
		{
			System.out.println("Element "+val+" found at index "+i);
		}
		else
		{
			System.out.println("Element "+val+" not found in array !");
		}
		System.out.println(Arrays.toString(a));
		
	}

}

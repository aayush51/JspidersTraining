package ProgramsOnArray;
import java.util.*;
public class HalfReversedArray2 {
	
	public static void main(String[] args) {
		
		int [] ar = {10,20,30,40,50,60,70,80};
		
		for (int i = ar.length/2 , j = 0 ; i < ar.length ;i++ ,j++) {
			if (i == ar.length-j)
			{
				break;
			}
			int temp = ar[i];
			ar[i] = ar[ar.length-1-j];
			ar[ar.length-1-j]=temp;
			
		}
		
		System.out.println(Arrays.toString(ar));
		
	}
}

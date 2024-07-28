package ProgramsOnArray;
import java.util.*;
public class ReverseArray3 {
	public static void main(String[] args) {
		int [] ar = {10,20,30,40,50,60,70};
		
		// two pointer approach
		for (int i = 0, j = ar.length-1 ; i < j ; i++ , j--) {
			int temp = ar[i];
			ar[i] = ar[j];
			ar[j] = temp;
		}
		System.out.println(Arrays.toString(ar));
	}
}